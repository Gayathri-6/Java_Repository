package class14_Polymorphism;

public class VariableLength {

	public static void main(String[] args) {
		
		VariableLength.add(90,9,1,2,4);
		VariableLength.display("Shaveen",1212,true,4);

	}
	public static void display(Object... values)
	{
		System.out.println(values.length);
		System.out.println(values[0]);
		
	}
	
	public static void add(int... values)
	{
		System.out.println(values.length);
		System.out.println(values[0]+values[1]+values[2]+values[3]+values[4]);
		
	}

	public static void add(double... values)
	{
		System.out.println(values.length);
		
	}

}
