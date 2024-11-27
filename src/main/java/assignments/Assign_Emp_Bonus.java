package assignments;

public class Assign_Emp_Bonus {

	public static void main(String[] args) {

        int emp_rating=0;
        
        if(emp_rating==5) {
        	System.out.println("Excellent, you earned 20% bonus");
        }
        
        else if(emp_rating==4) {
        	System.out.println("Very Good, you earned 10% bonus");
        }
        
        else if(emp_rating==3) {
        	System.out.println("Good, you earned 5% bonus");
        }
        
        else if(emp_rating<3) {
        	System.out.println("No Bonus");
        }

	}

}
