package stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_unique_values {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("kumar","karun","karthik","kavya","karun");
		
		// without Streams 
		List<String> UniqueList=new ArrayList<String>();
		for(String name:names) {
			if(!UniqueList.contains(name))
				UniqueList.add(name);
		}
		System.out.println(UniqueList);
		
		// with Streams
		List<String> uniqueVal1= names.stream().distinct().collect(Collectors.toList());
		System.out.println("with Streams : "+uniqueVal1);
		
	}
}
