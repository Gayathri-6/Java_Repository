package JavaFaker;

import com.github.javafaker.Faker;

public class JavaFakerSample {

	public static void main(String[] args) {

		Faker fake=new Faker();
		String email=fake.internet().emailAddress();
		String name=fake.name().fullName();
		String psw=fake.internet().password();
		
		
		
		
		
		
		
		System.out.println("email "+email);
		System.out.println("name "+name);
		System.out.println("psw "+psw);
		
		
//		System.out.println(fake.color().name());
//		System.out.println(fake.university().name());
//		String animal=fake.animal().name();
//		

	}

}
