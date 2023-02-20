package stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_example {

	public static void main(String[] args) {
		Stream<Integer> s1=Stream.of(1,2,3,4,5,6);
		s1.forEach(i->System.out.println(i));
		
		Stream <Integer> s2=Stream.of(new Integer[] {7,8,9,10});
		s2.forEach(i->System.out.println(i));
		
		// person example
		Predicate<Person> p1=per->per.getHeight()>=170;
		Map<String, List<String>> personMap=PersonRepository
												.getAllPersons()
												.stream()
												.filter(p1)
												.collect(Collectors.toMap(Person::getName, Person::getHobbies));
//		System.out.println(personMap);
		
		// collecting hobbies as List
		List<String> personHobbies=PersonRepository
									.getAllPersons() // List of Persons
									.stream() 		// Stream of Persons
									.map(Person::getHobbies) // Stream List<<String>>
									.flatMap(List::stream)	 // Stream <String>
									.distinct()
									.collect(Collectors.toList()); //collection to be returned
		
		System.out.println(personHobbies);
	}
}
