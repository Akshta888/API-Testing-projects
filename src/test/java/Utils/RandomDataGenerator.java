package Utils;

import net.datafaker.Faker;

public class RandomDataGenerator {
	
	static Faker faker= new Faker();
	public static void main(String[] args) {
		
	
		System.out.println(faker.number().digits(5));
		System.out.println(faker.name().fullName());
		System.out.println(callFullName());
	}
	
	public static String callFullName() {
		
		return faker.name().fullName();
		
		
		
	}

}
