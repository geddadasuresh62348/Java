package consumer_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<String, String> bcon2=(a,b)->System.out.println(a+" "+b);
		bcon2.accept("Mallika", "Srinu");
		
		List<Integer> lst1=Arrays.asList(new Integer(10),new Integer(20),new Integer(30));
		List<Integer> lst2=Arrays.asList(new Integer(10),new Integer(20));
		
		// to check both the lists have same no.of values
		BiConsumer<List<Integer>, List<Integer>> bcon3=(a,b)->{
			if(a.size() == b.size())
				System.out.println("Both having same size");
			else
				System.out.println("Different size");
		};
		bcon3.accept(lst1, lst2);
		
		// to do mathematical operations
		BiConsumer<Integer, Integer> bAdd=(a,b)->System.out.println("addition : "+(a+b));
		BiConsumer<Integer, Integer> bSubtraction=(a,b)->System.out.println("Subtraction : "+(a-b));
		BiConsumer<Integer, Integer> bMultiplication=(a,b)->System.out.println("Multiplication : "+(a*b));
		bAdd.andThen(bSubtraction).andThen(bMultiplication).accept(10, 10);
	}
}
