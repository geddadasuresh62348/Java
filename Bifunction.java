package function_interface;

import java.util.function.BiFunction;

public class Bifunction {

	static BiFunction<String, String, String> bifun=(a,b)->a.toUpperCase().concat(b);
	public static void main(String[] args) {
		System.out.println(bifun.apply("hello", " world"));
	}

}
