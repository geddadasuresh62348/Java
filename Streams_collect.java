package stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams_collect {

	public static void main(String[] args) {
			List<Integer> al=new ArrayList<Integer>();
			al.add(10);
			al.add(45);
			al.add(89);
			al.add(43);
			al.add(23);
			al.add(55);
			al.add(188);
			al.add(188);
			System.out.println(al);
			
			Long FailedStudents=al.stream().filter(i->i<=35).count();
			//1.toList() :-  converting into stream and applying filter 
//			Set<Integer> filteredList= al.stream().filter(i->i%2==0).collect(Collectors.toSet());
			System.out.println(FailedStudents);		
	}
}
