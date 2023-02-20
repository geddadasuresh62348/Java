package consumer_interface;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {

	public static List<Person> getAllPersons() {
		Person p1=new Person("Jahnavi",132,9000,"Female",2,Arrays.asList("yoga","swimming","cricket"));
		Person p2=new Person("Karthika",165,10000,"Female",2,Arrays.asList("yoga","singing","cricket"));
		Person p3=new Person("Prasanth",129,89000,"Male",2,Arrays.asList("Tennis","swimming","Reading"));
		Person p4=new Person("Harish",175,7000,"Male",2,Arrays.asList("Browising","Volunteering","cricket"));
		Person p5=new Person("Vinay",190,8500,"Male",2,Arrays.asList("yoga","Music","cricket"));
		
		return Arrays.asList(p1,p2,p3,p4,p5);
	}
	
	public static Person getPerson() {
		return new Person("Jahnavi",132,9000,"Male",2,Arrays.asList("yoga","swimming","cricket")); 
	}

	
}
