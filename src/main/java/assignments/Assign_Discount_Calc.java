package assignments;

public class Assign_Discount_Calc {

	public static void main(String[] args) {
		int purchase_val=250;
		int discount=0;
		int new_purchse_value;
		
		if(purchase_val>100) {
			discount=purchase_val*10/100;
			new_purchse_value=purchase_val-discount;
			System.out.println("You earned-$"+discount+ " discount and your final amount to be paid-$"+new_purchse_value);
		}
		
		else if(purchase_val<=100 && purchase_val>=50){
			discount=purchase_val*5/100;
			new_purchse_value=purchase_val-discount;
			System.out.println("You earned-$"+discount+ " discount and your final amount to be paid-$"+new_purchse_value);
			
		}
		else if(purchase_val<50){
			new_purchse_value=purchase_val;
			System.out.println("You earned-$"+discount+ " discount and your final amount to be paid-$"+new_purchse_value);
			
		}

	}

}
