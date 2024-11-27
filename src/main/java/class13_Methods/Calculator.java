package class13_Methods;

public class Calculator {

	public static void main(String[] args) {

		System.out.println("start");
		
		Calculator calc=new Calculator();
		calc.Addition();
		calc.Substraction();
		
		
		System.out.println("end");

	}
	public void Addition() {
		int a=123;
		int b=345;
		int c=a+b;
		System.out.println(c);
		
	}
	
	public void Substraction() {
		int a=900;
		int b=345;
		int c=a-b;
		System.out.println(c);
		
	}

}
