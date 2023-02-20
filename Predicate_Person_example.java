package predicate_interface;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_Person_example {
	
	static Predicate<Person> p1=per->(per.getHeight()>160);
	static Predicate<Person> p2=per->(per.getGender().equals("Male"));
	
	static List<Person> personList=PersonRepository.getAllPersons();
	public static void main(String[] args) {
		
		personList.forEach(person->{
			if(p1.and(p2).test(person))
				System.out.println(person.toString());
		});
	}
}
