package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter_method {

	public static void main(String[] args) {
		List<String> fruits=Arrays.asList("Apples","Banana","Orange","watermelon","Pineapple");
		fruits
		.stream()
		.filter(fruit->fruit.length()<=6)
		.collect(Collectors.toList())
		.forEach(fruit->System.out.println(fruit));
		
		PersonRepository.getAllPersons()
		.stream()
		.filter(per->per.getGender().equals("Male") && per.getHeight()>170)
		.collect(Collectors.toList())
		.forEach(per->System.out.println(per));
	}
}
