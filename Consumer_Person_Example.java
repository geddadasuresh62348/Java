package consumer_interface;

import java.util.List;
import java.util.function.Consumer;

public class Consumer_Person_Example {
	
	static Consumer<Person> con1=(p)->System.out.println(p);
	
	static Consumer<Person> con2=(p)->System.out.println(p.getName().toUpperCase());
	
	static Consumer<Person> con3=(p)->System.out.println(p.getHobbies());
	
	static List<Person> personsList= PersonRepository.getAllPersons();
	
	static void  personList(){
		personsList.forEach(con1.andThen(con2).andThen(con3));
	}
	
	static void conditionPerson() {
		personsList.forEach(p->{
			if(p.getGender().equals("Male") && p.getSalary() > 8000 && p.getHobbies().contains("swimming"))
				 con2.andThen(con3).accept(p);
		});
	}
	public static void main(String[] args) {
//		List<Person> personList= PersonRepository.getAllPersons();
//		con1.accept(PersonRepository.getPerson());
//		con2.accept(PersonRepository.getPerson());
//		con3.accept(PersonRepository.getPerson());
		
//		con1.andThen(con2).andThen(con3).accept(PersonRepository.getPerson());;
//		personList();
		conditionPerson();
	}

}
