package stream;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream_Counting_method {
	
	static Predicate<Person> p1=per->per.getGender().equals("Male");
	

	public static void main(String[] args) {
		Long personsCount=PersonRepository.getAllPersons()
					   .stream()
					   .filter(p1)
					   .map(Person::getKids)
					   .collect(Collectors.counting());
		System.out.println(personsCount);
	}
}
