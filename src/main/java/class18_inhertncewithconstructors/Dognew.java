package class18_inhertncewithconstructors;

public class Dognew extends Animalnew{
	
	String name;
	
	public Dognew() {
		
		System.out.println("Generic Dog");
	}
	
	public Dognew(String nameOfDog, Boolean available) {
		
		System.out.println("Name of the Dog "+nameOfDog+" Is this available "+available);
	}
	
	
	public Dognew(String nameOfDog) {
		this("Shenny",false);// call constructor with two arguments (this keyword use to implicit call for constructor)
		name=nameOfDog;
		System.out.println("Name of the Dog--"+nameOfDog);
	}

	public void makeSounds() {
		
		System.out.println("whuf whuf");
	}
}
