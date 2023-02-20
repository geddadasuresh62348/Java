package stream;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Reduce_Person_example {

	public static void main(String[] args) {
		Concatenated();
		Optional<Person> tallest=getTallestPerson();
		System.out.println(tallest.get());
		
		// counting total no.of kids
		Predicate<Person> p1=per->per.getHeight()>170;
		Predicate<Person> p2=per->per.getGender().equals("Male");
		int kidsCount=PersonRepository.getAllPersons()
				      .stream()
				      .filter(p1.and(p2))
				      .map(Person::getKids)
				      .reduce(0, Integer::sum);
		System.out.println("kids count : "+kidsCount);
	}

	private static void Concatenated() {
		String name=PersonRepository.getAllPersons()
					.stream()
					.map(Person::getName)
					.reduce("",(a,b)->a.concat(b));
		System.out.println(name);
	}
	static Optional<Person> getTallestPerson(){
		return PersonRepository.getAllPersons()
				.stream()
				.reduce((x,y)->x.getHeight()>y.getHeight()?x:y);
	}
}
