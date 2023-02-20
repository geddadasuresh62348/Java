package function_interface;

import java.util.function.Function;

public class Function_interface {

	static Function<String, String> fun1=name->name.toUpperCase();
	static Function<String, String> fun2=name->name.toUpperCase().concat(" world");
	
	public static void main(String[] args) {
//	System.out.println(fun1.apply("hello"));
//	System.out.println(fun2.apply("hello"));
	
	// andthen() method
	System.out.println("and then method : "+fun1.andThen(fun2).apply("hello"));
	System.out.println("compose method : "+fun1.compose(fun2).apply("hello"));
	}

}
