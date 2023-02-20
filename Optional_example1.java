package optional;

import java.util.Optional;


public class Optional_example1 {
	
	static String myName(String name) {
		return null;
	}
	static String personName(Person person) {
		System.out.println("is not null : "+person);
		if(person!=null)
			return person.getName();
		else
			return "No data found";
	}
	static Optional<String> OptionalPersonName(Optional<Person> person) {
		System.out.println("is optional not null : "+person);
		if(person.isPresent())
			return person.map(Person::getName);
		else
			return Optional.empty();
	}

	public static void main(String[] args) {
		System.out.println("Result without Optional: "+myName("John"));
		Optional<String> name=Optional.ofNullable(myName("hari"));
		System.out.println(name.isPresent()?name.get():"No data found");
		System.out.println("Person name : "+personName(new Person()));
		Optional<String> personName= OptionalPersonName(PersonRepository.getOptionalPerson());
		System.out.println(personName);
		
	}

}
