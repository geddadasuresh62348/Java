package parallel_Stream;

import java.util.stream.IntStream;

public class When_not_to_use_parallel_Stream2 {

	public static void main(String[] args) {
		Calculation calculation=new Calculation();
		IntStream.rangeClosed(1, 1000000000).forEach(calculation::calc);
		System.out.println("sequential : "+calculation.getTotal());
		calculation.setTotal(0);
		IntStream.rangeClosed(1, 1000000000).forEach(calculation::calc);
		System.out.println("parallel : "+calculation.getTotal());
	}
}
class Calculation{
	private int total;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	public int calc(int i) {
		return this.total+=i;
	}
}