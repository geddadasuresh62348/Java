package parallel_Stream;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Parallel_vs_sequential_Streams2 {
	
	static void printStream(IntStream stream) {
		stream.forEach(s->{
			System.out.println(LocalTime.now()+" value : "+s+" -thread : "+Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			}catch(Exception e) {
				e.printStackTrace();
			}
		});
	}
	public static void main(String[] args) {
		IntStream intstream1=IntStream.rangeClosed(1, 100);
		IntStream intstream2=IntStream.rangeClosed(1, 100);
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println("----- Sequential Run -------");
		printStream(intstream1);
		System.out.println("----- Parallel Run -------");
		printStream(intstream2.parallel());
	}
}
