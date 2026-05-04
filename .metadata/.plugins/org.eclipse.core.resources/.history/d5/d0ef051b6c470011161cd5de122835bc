package q5;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee e = (Employee) obj;

        return id == e.id && name.equals(e.name);
    }


    public int hashCode() {
        return 31 * id + name.hashCode();
    }
}

public class Main1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Amit");
        Employee e2 = new Employee(1, "Rahul");

        System.out.println("Equals: " + e1.equals(e2));
        System.out.println("HashCode e1: " + e1.hashCode());
        System.out.println("HashCode e2: " + e2.hashCode());
    }
}
