package class15_Constructors;

public class Trainer {
	
	String fullName;
	int phone;
	boolean permanant;
	
	
	public Trainer() {
		
		System.out.println("zero argument constructor");
	}
	public Trainer(String a) {
		
		fullName=a;
		System.out.println("one argument constructor--"+a);
		
	}
	public Trainer(String a,int b) {
		fullName=a;
		phone=b;
		System.out.println("two argument constructor--"+a+"--"+b);
	}

	public Trainer(String a,int b,boolean c) {
		
		fullName=a;
		phone=b;
		permanant=c;
		System.out.println("three argument constructor");
		System.out.println(fullName+"--"+phone+"--"+permanant);
	}

	
	public static void main(String[] args) {

		Trainer tr1=new Trainer("Mukesh");
		Trainer tr2=new Trainer("Gayathri", 909090);
		Trainer tr3=new Trainer();
		Trainer tr4=new Trainer("shaveen", 90564542, true);
		
		System.out.println("main method--"+tr1.fullName);
		System.out.println("main method--"+tr2.phone);
		System.out.println("main method--"+tr3.fullName);
		System.out.println("main method--"+tr4.permanant);
        
	}

}
