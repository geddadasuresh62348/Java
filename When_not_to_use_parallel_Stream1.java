package parallel_Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class When_not_to_use_parallel_Stream1 {

	static int sequentialCalculation(List<Integer> list) {
		long start=System.currentTimeMillis();
		int sum=list.stream()
				.reduce(0, (x,y)->x+y);
		long end=System.currentTimeMillis();
		System.out.println("sequential Duration : "+(end-start));
		
		return sum;
	}
	
	static int parallelCalculation(List<Integer> list) {
		long start=System.currentTimeMillis();
		int sum=list.parallelStream()
				.reduce(0, (x,y)->x+y);
		long end=System.currentTimeMillis();
		System.out.println("Parallel Duration : "+(end-start));
		
		return sum;
	}
	public static void main(String[] args) {
		List<Integer> nums=IntStream.rangeClosed(1, 10000000).boxed().collect(Collectors.toList());
		System.out.println(sequentialCalculation(nums));
		System.out.println(parallelCalculation(nums));
	}
}
