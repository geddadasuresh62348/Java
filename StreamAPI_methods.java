package stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI_methods {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(15,28,43,65,16);
		Stream<Integer> Data=nums.stream();
		
//		long count=doubleData.count();
		// 1. to sort values
		Stream<Integer> sortedData=Data.sorted();
		Stream<Integer> doubleData=sortedData.map(n->n*2);
	  doubleData.forEach(n->System.out.println(n));
	  
	  System.out.println("------another way to write streams in one line--------");
	  System.out.println(nums.parallelStream().map(n->n*3).filter(n->n>50).reduce((c,e)->c+e));	  
	}
}
