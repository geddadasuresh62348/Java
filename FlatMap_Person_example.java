package stream;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Person_example {
	
	static List<String> personHobbies(List<Person> personslist){
		return personslist
				.stream()
				.map(per->per.getHobbies())
				.flatMap(List::stream)
				.map(per->per.toUpperCase())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		System.out.println(personHobbies(PersonRepository.getAllPersons()));
	}

}
