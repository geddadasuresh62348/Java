package method_reference;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Method_reference_example {
	
	static Function<String, String> f1=name->name.toUpperCase();
	
	static Function<String, String> f2=String::toUpperCase;
	
	static Predicate<Person> p1=per->per.getHeight()>170;
	
	static Predicate<Person> p2=Method_reference_example::heightCheck;
	
	public static void main(String[] args) {
		
		System.out.println("Lambda Expression result : "+f1.apply("java8"));
		System.out.println("Method Reference result : "+f2.apply("java8"));
		
		System.out.println("Predicate result : "+p1.test(PersonRepository.getPerson()));
		System.out.println("Predicate result : "+p2.test(PersonRepository.getPerson()));
	}
	
	static boolean heightCheck(Person per) {
		return per.getHeight()>170;
	}
}
