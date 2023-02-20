package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinBy_maxBy_method {
	
	static Optional<Person> getTallestPerson() {
		return PersonRepository.getAllPersons()
		        .stream()
		        .collect(Collectors.maxBy(Comparator.comparing(Person::getHeight)));
	}
	static Optional<Person> getSmallestPerson() {
		return PersonRepository.getAllPersons()
				.stream()
				.collect(Collectors.minBy(Comparator.comparing(Person::getHeight)));
	}
	static List<Person> filterMultiplePersons(){
		List<Person> personlist=new ArrayList<Person>();
		
		Optional<Person> maxHeight=getTallestPerson();
		
		Person per=maxHeight.isPresent()?maxHeight.get():null;
		
		if(per!=null) {
		personlist=PersonRepository.getAllPersons()
				   .stream()
				   .filter(person->person.getHeight()==per.getHeight())
				   .collect(Collectors.toList());
		}
		return personlist;
	}
	public static void main(String[] args) {
		System.out.println("Tallest Person : "+getTallestPerson().get());
		System.out.println("Smallest person : "+getSmallestPerson().get());
		System.out.println(filterMultiplePersons());
	}

}
