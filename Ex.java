package optional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex {

	public static void main(String[] args) {
		List<String> lst=Arrays.asList("I","love","my","country","india","is","my","country");
		Map<String,Long> map=lst.stream()
		.collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(map);
	}
}
