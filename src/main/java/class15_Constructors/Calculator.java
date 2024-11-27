package class15_Constructors;

import java.util.Scanner;
/*
 *if you want to input data from the user, use scanner class its pre defined class 
 *
 */

public class Calculator {
	
	public Calculator(int a,int b) {
		
		int c=a+b;
		System.out.println("Addition is--"+c);
			
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number 1");
        int a=sc.nextInt();
        
		System.out.println("Enter number 2");
        int b=sc.nextInt();
        
		System.out.println("What operation do you need to perform-Please type");
		System.out.println("Add");
		System.out.println("Sub");
		System.out.println("Mul");
		System.out.println("Div");
		String c=sc.next();
		
		if(c.equalsIgnoreCase("Add")) {
			
			Calculator cal=new Calculator(a,b);
						
		}
		else if(c.equalsIgnoreCase("Sub")) {
			int sub=a-b;
			System.out.println("Substraction is-->"+sub);
		}
			
		else if (c.equalsIgnoreCase("Mul")) {
			int mul=a*b;
			System.out.println("Multiplication is-->"+mul);
				
		}
		
		else if (c.equalsIgnoreCase("Div")) {
			int div=a/b;
			System.out.println("Multiplication is-->"+div);
				
		}
		else {
			
			System.out.println("Sorry we can perform above operations only");
		}
			
		}
		

	}


