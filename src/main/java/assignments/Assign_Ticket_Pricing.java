package assignments;

public class Assign_Ticket_Pricing {

	public static void main(String[] args) {
		
		int[] age= {5,21,45,65};
		
		for(int a=0;a<age.length;a++) {
			
			System.out.println("age--->"+age[a]);	
			
		    if(age[a]<=12){
		        System.out.println("Ticket Price is $5");	
			
		      }
		    else if(13<=age[a]&&age[a]<=17){
			    System.out.println("Ticket Price is $7");	
			
		     }
		    else if(18<=age[a]&&age[a]<=59){
			    System.out.println("Ticket Price is $10");	
			
		     }
		    else if(60<=age[a]){
			    System.out.println("Ticket Price is $6");	
			
		     }
		
		 }

	  }

 }
