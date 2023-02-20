package stream_API;

public class Runnable_Lambda_Example {

	public static void main(String[] args) {
		
		// Before 
	 Runnable t1=new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Thread 1");
		}
	};
		new Thread(t1).start();

		// After 
		Runnable t2=()->System.out.println("Thread 2");
		new Thread(t2).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 3");
			}
		}).start();
		
		// using lambda function
		new Thread(()->System.out.println("Thread 4")).start();
	}
}