package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AllMatch_and_AnyMatch_method {

	static Predicate<String> p1=str->str.length()>7;
	
	static Predicate<Person> p2=per->per.getHeight()>=170;
	
	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("Apple","Mango","Grapes","Banana","Pineapple");
		Stream<String> allMatchFruits=fruits.stream();
		Stream<String> anyMatchFruits=fruits.stream();

		System.out.println(allMatchFruits.allMatch(p1));
		System.out.println(anyMatchFruits.anyMatch(p1));
		
		boolean b1=PersonRepository.getAllPersons()
					.stream()
					.allMatch(p2);
		System.out.println("all persons height >170? : "+b1);
		boolean b2=PersonRepository.getAllPersons()
				.stream()
				.anyMatch(p2);
		System.out.println("any person height >170? : "+b2);
	}
}
