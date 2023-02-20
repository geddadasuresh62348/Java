package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_method {
    
	public static void main(String[] args) {
		List<Integer> oddNumber=Arrays.asList(1,3,5,7,9);
		List<Integer> evenNumber=Arrays.asList(2,4,6,8);
		
		List<List<Integer>> numbers=Arrays.asList(oddNumber,evenNumber);
		System.out.println("Before flatten : "+numbers);
		
		List<Integer> flattenList=numbers
								.stream()
								//.flatMap(list->list.stream())
								.flatMap(List::stream)
								.collect(Collectors.toList());
		System.out.println("After flatten : "+flattenList);
	}
}
