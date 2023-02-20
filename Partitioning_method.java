package stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Partitioning_method {
	
	static Predicate<Person> p1=per->per.getHeight()>=160;
	
	static void byHeight() {
		Map<Boolean,List<Person>> map=PersonRepository.getAllPersons()
		.stream()
		.collect(Collectors.partitioningBy(p1));
		System.out.println(map);
	}
	
	static void byHeightWithMap() {
		Map<Boolean,Map<String,List<String>>> map=PersonRepository.getAllPersons()
		.stream()
		.collect(Collectors.partitioningBy(p1,Collectors.toMap(Person::getName, Person::getHobbies)));
		
		System.out.println(map);
	}
	public static void main(String[] args) {
//		byHeight();
		byHeightWithMap();
	}

}
