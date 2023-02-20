package consumer_interface;

import java.util.function.Consumer;

public class Consumer_Interface {

	public static void main(String[] args) {
		Consumer<String> con1= (s)->{System.out.println(s.toLowerCase());};
//		con1.accept("SAMARASIMHAREDDY");
		
		Consumer<String> con2=(s)->System.out.println(s.toCharArray());
//		con2.accept("SAMARASIMHAREDDY");
		
		con1.andThen(con2).accept("SAMARASIMHAREDDY");
	}
}
