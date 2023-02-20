package stream;

import java.util.stream.Collectors;

public class Stream_averagingInt {

	public static void main(String[] args) {
		double avgSalary=PersonRepository.getAllPersons()
						.stream()
						.collect(Collectors.averagingDouble(Person::getSalary));
		System.out.println(avgSalary);
	}
}
