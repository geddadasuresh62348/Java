package parallel_Stream;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Parallel_vs_sequential_Streams1 {
	
	static int sumMethodUsingSeq() {
		return IntStream.rangeClosed(1, 1000000).sum();
	}
	
	static int sumMethodUsingParallel() {
		return IntStream.rangeClosed(1, 1000000).parallel().sum();
	}
	
	static long checkPerformance(Supplier<Integer> sum,int numOfTimes) {
		long start=System.currentTimeMillis();
		for(int i=0;i<=numOfTimes;i++) {
			sum.get();
		}
		long end=System.currentTimeMillis();
		return end-start;
	}
	static long check(boolean b) {
		long start=System.currentTimeMillis();
		for(int i=0;i<2500;i++)
			if(b)
			sumMethodUsingSeq();
			else
			sumMethodUsingParallel();
		long end=System.currentTimeMillis();
		return end-start;
	}
	public static void main(String[] args) {
//		System.out.println("sum from sequential : "+sumMethodUsingSeq());
//		System.out.println("sum from parallel : "+sumMethodUsingParallel());
		
//		System.out.println("sum from sequential : "+checkPerformance(Parallel_vs_sequential_Streams1::sumMethodUsingSeq,25000));
//		System.out.println("sum from parallel : "+checkPerformance(Parallel_vs_sequential_Streams1::sumMethodUsingParallel,25000));
		
		System.out.println("squential : "+check(true));
		System.out.println("parallel : "+check(false));
	}
}







