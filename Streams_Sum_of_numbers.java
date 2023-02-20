package stream_API;

import java.util.stream.IntStream;

public class Streams_Sum_of_numbers {

	public static void main(String[] args) {
		int total=IntStream.range(0, 51).map(Integer :: new).sum();
		System.out.println("Total in Java 8 : "+total);
	}
}
