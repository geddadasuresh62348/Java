package stream;

import java.util.Arrays;
import java.util.List;

public class Reduce_method {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		int sum=numbers.stream().mapToInt(i->i).sum();
		System.out.println(sum);
		
		// Multiplication
		System.out.println(numbers.stream().reduce(1,(a,b)->a*b));
		// 1*1=1
		// 1*2=2
		// 2*3=6
		// 6*4=24
		// 24*5=120
		
		// Addition
		System.out.println(numbers.stream().reduce(0, (a,b)->a+b));
	}
}
