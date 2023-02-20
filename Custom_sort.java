package stream;

import java.util.Comparator;

public class Custom_sort {

	public static void main(String[] args) {
		//Sort by name
		
		PersonRepository.getAllPersons()
		.stream()
		.sorted(Comparator.comparing(Person::getName))
		.forEach(System.out::println);
		System.out.println("=============");
		
		// sort by height
		PersonRepository.getAllPersons()
		.stream()
		.sorted(Comparator.comparing(Person::getHeight))
		.forEach(System.out::println);
		System.out.println("=============");
		
		// reverse sort by height
		PersonRepository.getAllPersons()
		.stream()
		.sorted(Comparator.comparing(Person::getHeight).reversed())
		.forEach(System.out::println);
		System.out.println("=============");

	}
}
