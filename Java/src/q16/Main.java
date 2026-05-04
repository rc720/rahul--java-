package q16;

class Manager {
	String t1 = "dshd";
	String t2 = "dshg";

	public Manager() {
		System.out.println("Parent constructor");
	}

	public void displayTask() {
		System.out.println("Parent class method");
	}
}
class Emp extends Manager {

	public Emp() {
		super();
		System.out.println("Child");
		System.out.println(super.t1);
		System.out.println(super.t2);
	}

	public void display() {
		super.displayTask();
	}
}
public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.display();
	}
}
