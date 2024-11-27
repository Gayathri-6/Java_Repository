package class14_Polymorphism;

public class MethodOverloading {
	
	/*matching the method with the same signature
	 * signature
	 * no of argukments
	 * type of arguments
	 * order of arguments*/
	
	public static void main(String[] args) {
		
		MethodOverloading add=new MethodOverloading();
		//add.addition();
		//add.addition(390, 10);
		//add.addition(390, 10.89);
		//add.addition(144.98, 10);
		//add.addition(390.12, 10.89);
		//add.addition(54.5, 12.3);
		add.addition(54.5f, 12.3f);
		
	}
	
	public void addition() {
		int a=10;
		int b=90;
		int c=a+b;
		
		System.out.println("addition 1-->"+c);
		
	}
	public void addition(int a,int b) {
		
		System.out.println("addition 2-->"+(a+b));
		
	}
	
	public void addition(int a,Double b) {
		
		System.out.println("addition 3-->"+(a+b));
		
	}
	
	public void addition(Double a,int b) {
		
		System.out.println("addition 4-->"+(a+b));
		
	}
	
//public void addition(Double a,Double b) {
//	  
//	  double c=a+b;
//	  System.out.println("addition 5-->"+c);
//		
//	}
	
 void addition(float a,float b) {
		
		System.out.println("addition 6-->"+(a+b));
		
	}	
	

}
