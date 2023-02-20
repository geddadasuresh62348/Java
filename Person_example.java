package parallel_Stream;

import java.util.List;
import java.util.stream.Collectors;

import stream.PersonRepository;

public class Person_example {
	
	static List<String> getHobbiesBySeq(){
		long start=System.currentTimeMillis();
		List<String> personHobbies=PersonRepository.getAllPersons()
				.stream()
				.map(per->per.getHobbies())
				.flatMap(hobbies->hobbies.stream())
				.collect(Collectors.toList());
		long end=System.currentTimeMillis();
		System.out.println("sequential Duration : "+(end-start));
		return personHobbies;
	}
	
	static List<String> getHobbiesByParallel(){
		long start=System.currentTimeMillis();
		List<String> personHobbies=PersonRepository.getAllPersons()
				.parallelStream()
				.map(per->per.getHobbies())
				.flatMap(hobbies->hobbies.stream())
				.collect(Collectors.toList());
		long end=System.currentTimeMillis();
		System.out.println("Parallel  Duration : "+(end-start));
		return personHobbies;
	}
	
	public static void main(String[] args) {
		System.out.println(getHobbiesBySeq());
		System.out.println(getHobbiesByParallel());
	}
}
