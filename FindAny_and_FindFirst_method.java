package stream;

import java.util.Optional;
import java.util.function.Predicate;

public class FindAny_and_FindFirst_method {

	static Predicate<Person> p1=per->per.getHeight()>=190;

	static Predicate<Person> p2=per->per.getGender().equals("Male");
	
	public static void main(String[] args) {
		Optional<Person> per1=PersonRepository.getAllPersons()
							.stream()
							.filter(p1)
							.findAny();
		System.out.println(per1.get());
		
		Optional<Person> per2=PersonRepository.getAllPersons()
							 .stream()
							 .filter(p2)
							 .findFirst();
		System.out.println(per2.get());
	}
}
