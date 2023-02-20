package consumer_interface;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumer_Person_Example {
	static List<Person> personList=PersonRepository.getAllPersons();
	static void PersonDetails() {
		BiConsumer<String, List<String>> biCon=(name,hobbies)->System.out.println(name+" : "+hobbies);
		personList.forEach(person->biCon.accept(person.getName(), person.getHobbies()));
	}
	public static void main(String[] args) {
		PersonDetails();
	}

}
