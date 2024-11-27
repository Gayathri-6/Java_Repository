package class18_inhertncewithconstructors;

public class student {
	String name;
	int marks;
	
	public student(String name, int marks) {
		
		this.name=name;
		this.marks=marks;
		
	}
	public void show() {
		
		System.out.println("showing details");
        this.show(true);
		
	}
	
	public void show(boolean status)  {
		
		System.out.println(name);
		System.out.println(marks);
	}

}
