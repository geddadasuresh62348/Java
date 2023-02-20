package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

import java.util.HashMap;

public class Grouping_method {
	
	// grouping based on gender
	static void groupByGender() {
		Map<String, List<Person>> groupedData= PersonRepository.getAllPersons()
		.stream()
		.collect(Collectors.groupingBy(Person::getGender));
		
		groupedData.entrySet().forEach(System.out::println);
	}
	
	// grouping based on height
	static void groupByHeight() {
		Map<String, List<Person>> groupedData=PersonRepository.getAllPersons()
		.stream()
		.collect(Collectors.groupingBy(per->per.getHeight()>=160?"Tallest":"Shortest"));
		System.out.println(groupedData);
	}
	
	//two level grouping
	static void twoLevelGrouping() {
		Map<String,Map<String,List<Person>>> groupedData= PersonRepository.getAllPersons()
		.stream()
		.collect(Collectors.groupingBy(Person::getGender, groupingBy(per->per.getHeight()>=160?"Tallest":"Shortest")));
		
		Stream.of(groupedData).forEach(System.out::println);
	}
	
	static void twoLevelGroupingCount() {
		Map<String,Integer> groupedData=PersonRepository.getAllPersons()
		.stream()
		.collect(Collectors.groupingBy(Person::getName,summingInt(Person::getKids)));
		
		Stream.of(groupedData).forEach(System.out::println);
	}
	
	// three level grouping
	static void threeLevelGrouping() {
		Map<String,List<Person>> groupedData=PersonRepository.getAllPersons()
				.stream()
				.collect(Collectors.groupingBy(Person::getGender,HashMap::new,Collectors.toList()));
				
				Stream.of(groupedData).forEach(System.out::println);
	}
	public static void main(String[] args) {
//		groupByGender();
//		groupByHeight();
//		twoLevelGrouping();
//		twoLevelGroupingCount();
		threeLevelGrouping();
	}
}
