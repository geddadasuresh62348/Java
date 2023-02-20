package stream_API;

import java.util.Comparator;

public class Comparator_Lambda_function {

	public static void main(String[] args) {
		
		// Before
		
		Comparator<Integer> c1=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer x, Integer y) {
				
				return x.compareTo(y);
			}
		};
		System.out.println("Result : "+c1.compare(19, 19));
		
		// After java 8
		Comparator<Integer> c2=(Integer x,Integer y)->x.compareTo(y);
		System.out.println("Result : "+ c2.compare(12, 12));
		
		// or 
		Comparator<Integer> c3=(x,y)->x.compareTo(y);
		System.out.println(c3.compare(12, 12));
	}
}
