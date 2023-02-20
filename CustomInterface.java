package stream_API;

@FunctionalInterface
public interface CustomInterface {

	public void add();

	default String hello() {
		return "Hello";
	}
	static boolean isTrue() {
		return true;
	}
}
