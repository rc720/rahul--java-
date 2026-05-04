package q22;

class TestSleep extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(5000); // pause for 5 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}
public class Main2 {
    public static void main(String[] args) {

        TestSleep t1 = new TestSleep();
        TestSleep t2 = new TestSleep();

        t1.start();
        t2.start();
    }
}

