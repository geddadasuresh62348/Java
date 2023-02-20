package function_interface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class Function_Person_example {
	
	static Function<String, Integer> f1=name->name.length();
	
	static Predicate<String> Pred=gender->gender.equals("Female");
	
	static Function<List<Person>, Map<String,Double>> f2=personList->{
		Map<String, Double> personMap=new HashMap<String,Double>();
		personList.forEach(per->{
			if(Pred.test(per.getGender()))
			personMap.put(per.getName(), per.getSalary());
		});
		return personMap;
	};
	public static void main(String[] args) {
		System.out.println(f1.apply("hello"));
		
		List<Person> personList=PersonRepository.getAllPersons();
		System.out.println(f2.apply(personList));
	}

}
