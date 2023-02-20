package consumer_interface;

import java.util.function.Predicate;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
public class Consumer_and_Predicate_example {
	
	static Predicate<Person> p1=per->per.getHeight()>160;
	static Predicate<Person> p2=per->per.getGender().equals("Male");
	
	static BiConsumer<String,List<String>> bCon=(name,hobbies)->System.out.println(name+" "+hobbies);
	
	static Consumer<Person> personConsumer=per->{
		if(p1.and(p2).test(per))
			bCon.accept(per.getName(), per.getHobbies());
	};
	public static void main(String[] args) {
		
	List<Person> personList=PersonRepository.getAllPersons();
	personList.forEach(personConsumer);
	}

}
