package Assignment_Selenium3;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.MalformedURLException;


public class ImagesToPDF {

	public static void main(String[] args) throws MalformedURLException, IOException, DocumentException {

		 Document document = new Document();
		 File root = new File("./Screenshot/"); 
		 String outputFile = "imagepdf.pdf";
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
	          System.out.println("List of the png files in the specified directory:");  
	          for(String fileName : imageFilesList) {
	             System.out.println(fileName);
	             
	             
	             try {
		 				    document.newPage();
		 	 	            Image image = Image.getInstance(new File(root, fileName).getAbsolutePath());
	
		 	 	            image.setAbsolutePosition(0, 0);
		 	 	            image.setBorderWidth(0);
		 	 	            image.scaleAbsolute(PageSize.A4);
		 	 		        System.out.println("666");	
		 	 		        document.open();
		 	 	            document.add(image);
		 	 		 
		 	 			} catch (FileNotFoundException | DocumentException e) {
		 	 				// TODO Auto-generated catch block
		 	 				e.printStackTrace();
		 	 			}
		 	   
	             
	          }
	         
	          document.close(); 
	      }
	    
	}


	

