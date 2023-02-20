package method_reference;

import java.util.function.Consumer;

public class Lambda_local_variable {
	
	static int i=10;
	static Consumer<Integer> cns1=num->{
		i++;
		System.out.println(i);
	};
	public static void main(String[] args) {
		int j=20;
	Consumer<Integer> cns2=num->{
		//j++; //Local variable j defined in an enclosing scope must be final or effectively final
		System.out.println(j+num);
	};
	
		cns1.accept(100);
		cns2.accept(20);
	}

}
