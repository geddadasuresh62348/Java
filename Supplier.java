package supplier_interface;

import java.util.List;

public class Supplier {

	static java.util.function.Supplier<Person> s1=()->PersonRepository.getPerson();
	
	static java.util.function.Supplier<List<Person>> s2=()->PersonRepository.getAllPersons();
	
	public static void main(String[] args) {
		
		System.out.println(s1.get());
		s2.get().forEach(person->System.out.println(person));
	}

}
