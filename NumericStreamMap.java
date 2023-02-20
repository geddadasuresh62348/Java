package stream_factory_methods;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMap {
	
	static double mapToDouble() {
		return IntStream.rangeClosed(1, 20).mapToDouble(x->x).sum();
	}
	
	static List<Integer> mapToObject(){
		return IntStream.rangeClosed(1, 9).mapToObj(x->{
			return new Integer(x);
		}).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		System.out.println(mapToDouble());
		System.out.println(mapToObject());
	}
}
