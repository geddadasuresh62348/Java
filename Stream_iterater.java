package stream_factory_methods;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Stream_iterater {

	static UnaryOperator<Integer> add=x->x+2;
	
	public static void main(String[] args) {
		
		Stream<Integer> s1=Stream.iterate(0, add).limit(10);
		System.out.println(s1.toList());
	}
}
