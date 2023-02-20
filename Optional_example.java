package optional;

import java.util.Optional;

public class Optional_example {

	public static void main(String[] args) {
		Optional<String> ofNullable=Optional.ofNullable("Springboot");
		System.out.println(ofNullable);
	}
}
