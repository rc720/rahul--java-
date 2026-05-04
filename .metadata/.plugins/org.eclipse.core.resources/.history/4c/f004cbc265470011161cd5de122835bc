package q2;

class Vehicle {
    Vehicle getInstance() {
        return new Vehicle();
    }
    void show() {
        System.out.println("I am Vehicle");
    }
}
class Car extends Vehicle {
    @Override
    Car getInstance() {
        return new Car();
    }

    @Override
    void show() {
        System.out.println("I am Car");
    }
}
public class Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        v.getInstance().show();

        Car c = new Car();
        c.getInstance().show(); 
    }
}
