package Assignment_Selenium3;

import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.MalformedURLException;

public class Screen_Monitor {
	
	public static String getCurrentDateTime() {
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatdate=DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
		String newdate=formatdate.format(now);
		return newdate;
				
	}
	
public static void createPDF() throws MalformedURLException, IOException {
	
	Document document=new Document();
	 File root = new File("./Screenshot/"); 
	 String outputFile = "imagepdf.pdf";
	 try {
		PdfWriter.getInstance(document, new FileOutputStream(new File(root, outputFile)));
   	 //Creating a File object for directory
        File directoryPath = new File("./Screenshot/");
        //Creating filter for png files
        FilenameFilter pngFilefilter = new FilenameFilter(){
             public boolean accept(File dir, String name) {
                String lowercaseName = name.toLowerCase();
                if (lowercaseName.endsWith(".png")) {
                   return true;
                } else {
                   return false;
                }
             }
          };        
          String imageFilesList[] = directoryPath.list(pngFilefilter);
          
          for(String fileName : imageFilesList) {
             System.out.println(fileName);
             
             try {
	 				    document.newPage();
	 				    Image image= Image.getInstance(new File(root, fileName).getAbsolutePath());
	 	 	         

	 	 	            image.setAbsolutePosition(0, 0);
	 	 	            image.setBorderWidth(0);
	 	 	            image.scaleAbsolute(image);
	 	 	         //   image.scaleAbsolute(PageSize.A4);
	 	 		        document.open();
	 	 	            document.add(image);
	 	 		 
	 	 			} catch (FileNotFoundException | DocumentException e) {
	 	 				// TODO Auto-generated catch block
	 	 				e.printStackTrace();
	 	 			}
	 	   
             
          }
         
          document.close(); 
        
        
        
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}	


	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	        	 final long NANOSEC_PER_SEC = 1000l*1000*1000;

	        	 long startTime = System.nanoTime();
	        	 int i=1;
	        	 
	        	 while ((System.nanoTime()-startTime)< 60*NANOSEC_PER_SEC){

	        		 try {
	        			
	        				TakesScreenshot tss=(TakesScreenshot)driver;
	        				
	        				File src=tss.getScreenshotAs(OutputType.FILE);
	        				System.out.println(src.getAbsolutePath());
	        				
	        				File dest=new File("./Screenshot/"+getCurrentDateTime()+"_"+i+".png");
	        				
	        				System.out.println(dest.getAbsolutePath());
	        			 
	        				FileHandler.copy(src,dest);
	        				i++;
	        				
	        				
	 	    		} catch (IOException e) {
	 	    			System.out.println("Screenshot capture fail--"+e.getMessage());
	 	    		}
	        		 Thread.sleep(5000);

	        		} 
	
	        	 

		try {
			createPDF();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	        	 
		}
	
	}
	
		
	


