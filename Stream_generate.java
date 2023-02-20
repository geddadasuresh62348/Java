package stream_factory_methods;

import java.util.Random;
import java.util.stream.Stream;

public class Stream_generate {

	public static void main(String[] args) {
		
		// to generate infinite random float numbers
		Stream<Double> randomNumbers=Stream.generate(Math::random).limit(10);
		System.out.println(randomNumbers.toList());
		
		// to generate infinite random integer numbers
		Stream<Integer> randomIntegers=Stream.generate(new Random():: nextInt).limit(10);
		System.out.println(randomIntegers.toList());
	}
}
