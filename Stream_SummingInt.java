package stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_SummingInt {
	
	static int sumOfNumbers() {
		return Arrays.asList(1,2,3,4,5)
				.stream()
			  //.collect(Collectors.summingInt(x->x));
				.collect(Collectors.summingInt(Integer::intValue));
	}
	public static void main(String[] args) {
		int sumOfKids=PersonRepository.getAllPersons()
					   .stream()
					   .collect(Collectors.summingInt(Person::getKids));
		System.out.println(sumOfKids);
		
		//sum of numbers 
		System.out.println(sumOfNumbers());
		
	}
}
