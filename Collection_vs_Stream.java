package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Collection_vs_Stream {

	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("Harika");
		names.add("Prasanna");
		names.add("Anitha");
		
		for(String name : names) 
			System.out.println(name);
		System.out.println("======");
		
		// Stream 
		Stream<String> namesStream=names.stream();
		namesStream.forEach(name->System.out.println(name));
//		namesStream.forEach(name->System.out.println(name));  we cannot reuse the stream 
		}
	}

