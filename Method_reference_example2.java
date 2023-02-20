package method_reference;

import java.util.Comparator;

public class Method_reference_example2 {
	
	// Classname::methodName
	public static void main(String[] args) {
		System.out.println("result 1 : "+Method_reference_example2.compare(10, 20));
		
		Comparator<Integer> cmp=Method_reference_example2::compare;
		System.out.println("result 2 : "+cmp.compare(10, 20));
	}
	
	public static int compare(Integer x,Integer y) {
		return Integer.compare(x, y);
	}
}
