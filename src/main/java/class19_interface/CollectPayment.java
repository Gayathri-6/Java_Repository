package class19_interface;

public class CollectPayment {

	public static void main(String[] args) {
//you can access interface defined methods only because interface is your reference
		
//pay.Payment_maya pay.Payment_raja pay.Payment_tata not allowed
		
		payment pay=new CashPayment();
		pay.Payment();

	}

}
