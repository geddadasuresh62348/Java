package function_interface;

import java.util.Comparator;

public class BinaryOperator {

	static Comparator<Integer> cmp=(a,b)->a.compareTo(b);
	
	public static void main(String[] args) {
		java.util.function.BinaryOperator<Integer> bo1=java.util.function.BinaryOperator.maxBy((a,b)->(a>b)?1:(a==b)?0:-1);
		System.out.println("result 1 : "+bo1.apply(102, 101));
		
		java.util.function.BinaryOperator<Integer> bo2=java.util.function.BinaryOperator.maxBy(cmp);
		System.out.println("result 2 : "+bo2.apply(90, 56));
		
		java.util.function.BinaryOperator<Integer> bo3=java.util.function.BinaryOperator.minBy(cmp);
		System.out.println("result 3 : "+bo3.apply(78, 12));
	}
}
