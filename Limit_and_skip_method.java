package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit_and_skip_method {

	public static void main(String[] args) {
		 List<String> fruits=Arrays.asList("Apple","Mango","Grapes","Banana","Pineapple");
		
		//1. limit_method
		List<String> limitedFruits=fruits
								.stream()
								.limit(3)
								.collect(Collectors.toList());
		System.out.println("Limited Fruits : "+limitedFruits);
		
		List<String> skipFruits=fruits
								.stream()
								.skip(3)
								.collect(Collectors.toList());
		System.out.println("Skip Fruits : "+skipFruits);
		}
}
