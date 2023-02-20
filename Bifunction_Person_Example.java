package function_interface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Bifunction_Person_Example {
	
	static Predicate<Person> p1=per->per.getGender().equals("Male");
	
	static Predicate<Person> p2=per->per.getHeight()>170;
	
	static BiFunction<List<Person>, Predicate<Person>, Map<String,Double>> mainFunc=(person,predicate)->{
		Map<String, Double> map=new HashMap<String,Double>();
		person.forEach(per->{
			if(p1.and(predicate).test(per))
				map.put(per.getName(), per.getSalary());
		});
		return map;
	};
	public static void main(String[] args) {
		List<Person> personList = PersonRepository.getAllPersons();
		Map<String,Double> personMap= mainFunc.apply(personList, p2);
		System.out.println(personMap);
	}
}
