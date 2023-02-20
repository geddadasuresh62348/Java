package stream_factory_methods;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntStream_method {

	public static void main(String[] args) {
		IntStream intStream1=IntStream.rangeClosed(1, 6);
		IntStream intStream2=IntStream.range(1, 6);
		
//		System.out.println("sum : "+intStream1.sum());
		intStream1.forEach(System.out::println);
		System.out.println("++++++++++++++++++");
		intStream2.forEach(System.out::println);
		
		LongStream.rangeClosed(1, 20).forEach(System.out::println);
		DoubleStream doubleStream=LongStream.rangeClosed(1, 8).asDoubleStream();
		
		OptionalInt max=IntStream.rangeClosed(1, 20).max();
		System.out.println("max value is : "+max.getAsInt());
		
		OptionalLong min=LongStream.range(1, 20).min();
		System.out.println("min value is : "+min.getAsLong());
		
		OptionalDouble avg=IntStream.rangeClosed(1, 20).average();
		System.out.println("average value is : "+avg.getAsDouble());
		
	}
}
