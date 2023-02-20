package stream_factory_methods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Boxing_unboxing {
	
	//converting primitive datatype to wrapper class 
	static List<Integer> boxingMethod(){ 
		return IntStream.rangeClosed(1, 19).boxed().collect(Collectors.toList());
	}
	
	//converting wrapper class to primitive type
	static int calcSum(List<Integer> list) {
//		return list.stream().mapToInt(Integer::intValue).sum();
		return list.stream().reduce(0, (a,b)->a+b);
	}
	
	public static void main(String[] args) {
		System.out.println(boxingMethod());
		System.out.println(calcSum(Arrays.asList(1,2,3,4)));
	}
}
