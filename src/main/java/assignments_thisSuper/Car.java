package assignments_thisSuper;

public class Car extends Vehicle{
	
	String car_brand;
	String car_model;

	public Car(String Type,String car_brand,String car_model) {
		
		
		super(Type);
		super.displayInfo(true);
		
		this.car_brand=car_brand;
		this.car_model=car_model;
		this.displayInfo();
	}

	public void displayInfo(){
		
     	System.out.println("Brand -"+car_brand+" and Model -"+car_model);
		
	}
	

}
