package stream_factory_methods;

import java.util.stream.Stream;

public class Stream_of_method {

	public static void main(String[] args) {
		Stream<String> s1=Stream.of("one","two","three");
		System.out.println(s1.toList());
	}
}
