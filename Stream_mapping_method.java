package stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

public class Stream_mapping_method {

	static List<String> mappingName(){
		// old way
		List<String> names1=PersonRepository.getAllPersons()
							.stream()
							.map(Person::getName)
							.collect(Collectors.toList());
		List<String> names2=PersonRepository.getAllPersons()
							.stream()
							.collect(mapping(Person::getName,Collectors.toList()));
		return names2;
	}
	
	public static void main(String[] args) {
		System.out.println(mappingName());
	}
}
