package stream;

import java.util.List;
import java.util.stream.Collectors;

public class Peek_method {
	
	public static void main(String[] args) {
		
		List<String> personNames=PersonRepository.getAllPersons()
								.stream()
								.peek(per->System.out.println(per))
								.map(Person::getName)
								.peek(System.out::println)
								.collect(Collectors.toList());
		System.out.println(personNames);
	}

}
