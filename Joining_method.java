package stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joining_method {

	static String PersonNamesJoining() {
		return PersonRepository.getAllPersons()
				.stream()
				.map(Person::getName)
//				.collect(Collectors.joining())
//				.collect(Collectors.joining("_"));
				.collect(Collectors.joining("_","[","]"));
	}
	
	public static void main(String[] args) {
		char[] ch= {'a','e','i','o','u'};
		String join1=Stream.of(ch).map(x->new String(x)).collect(Collectors.joining());
		String join2=Stream.of(ch).map(arr->new String(arr)).collect(Collectors.joining("-","[","]"));
		System.out.println("joined data : "+join1);
		System.out.println("joined data : "+join2);
		System.out.println("joined data : "+PersonNamesJoining());	
	}
}
