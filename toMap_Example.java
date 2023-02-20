package stream;

import java.util.stream.Collectors;

public class toMap_Example {

	public static void main(String[] args) {
		System.out.println(PersonRepository.getAllPersons().stream().collect(Collectors.toMap(Person::getName, Person::getKids)));
	}
}
