package predicate_interface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiPredicate {
	static BiConsumer<String, List<String>> biCon=(name,hobbies)->System.out.println(name +" "+hobbies);
	
	static java.util.function.BiPredicate<Integer, String> biPred=(height,gender)-> height>160 && gender.equals("Male");
	
	static Consumer<Person> personConsumer=per->{
		if(biPred.test(per.getHeight(),per.getGender()))
//			biCon.accept(per.getName(), per.getHobbies());
		//or
			System.out.println(per.getName() +" - "+per.getHobbies());
	};
	public static void main(String[] args) {
		List<Person> personList=PersonRepository.getAllPersons();
		personList.forEach(personConsumer);
	}

}
