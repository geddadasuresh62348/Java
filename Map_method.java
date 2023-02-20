package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_method {

	// method to convert list elements to Uppercase
	static List<String> toUppercase(List<Person> listFruits){
		return listFruits
				.stream()
				.map(per->per.getName().toUpperCase())
				.collect(Collectors.toList());
	}
	public static void main(String[] args) {
		
		List<String> fruits=Arrays.asList("Apples","Banana","Orange","watermelon","Pineapple");
		List<Integer> fruitsLength=fruits.stream()
										  .map(fruit->fruit.length())
										  // map(String::length)
										  .collect(Collectors.toList());
		System.out.println(fruitsLength);
		
		System.out.println(toUppercase(PersonRepository.getAllPersons()));
		
	}
}
