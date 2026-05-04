package q19;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program is running successfully");

        Demo obj = new Demo();
        obj = null;

        System.gc();
    }
}
class Demo {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method called");
    }
}
