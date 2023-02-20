package function_interface;

import java.util.function.IntUnaryOperator;

public class UnaryOperator {
	
	static java.util.function.UnaryOperator<String> u1=name->name.toUpperCase();
	
	static IntUnaryOperator u2=num->num*34;
	
	public static void main(String[] args) {
		System.out.println(u1.apply("t20"));
		System.out.println(u2.applyAsInt(90));
	}
}
