package predicate_interface;

public class Predicate {

	public static void main(String[] args) {
		java.util.function.Predicate<Integer> greater=a->(a>34);
		java.util.function.Predicate<Integer> less=a->(a<45);
		java.util.function.Predicate<Integer> equal=a->(a==39);
		
		boolean result=greater.test(34);
//		System.out.println(result);
		
		boolean result_2=greater.and(less).and(equal).test(38);
		System.out.println(result_2);
		
		boolean result_3=greater.negate().test(23);
		System.out.println(result_3);
	}

}
