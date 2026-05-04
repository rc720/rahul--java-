package q24;

class Counter {
    int count = 0;

    // synchronized ensures only ONE thread executes this method at a time
    synchronized void increment() {
        count++;
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        t1.start();
        t2.start();
        // Wait for both threads to finish
        t1.join();
        t2.join();
        System.out.println("Final Count: " + counter.count);
    }
}
