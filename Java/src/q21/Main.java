package q21;

class Test implements Runnable {
	@Override
	public void run() {
		System.out.println("thread is running");
	}
}

public class Main {
	public static void main(String[] args) {

		Test test = new Test();
		test.run();

		Thread thread = new Thread(test);
		thread.start();

		new Thread() {
			public void run() {
				System.out.println("thread2 is running");
			};
		}.start();

		new Thread(new Runnable() {

			public void run() {
				System.out.println("thread3 is running");
			}

		}).start();
	}
}

