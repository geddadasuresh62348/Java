package stream;

import java.util.List;

public class Count_method {

	static long count(List<Person> personslist) {
		return personslist
				.stream()
				.map(Person::getHobbies)
				.flatMap(List::stream)
				.distinct()
				.count();
	}
	public static void main(String[] args) {
		System.out.println("Count : "+count(PersonRepository.getAllPersons()));
	}
}
