package q5;

class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class main {
    public static void Main(String[] args) {
        try {
            Student s1 = new Student(101, "Rahul");

            Student s2 = (Student) s1.clone();

            s1.display();
            s2.display();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
