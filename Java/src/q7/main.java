package q7;

abstract class Greeting {
    abstract void say();
}

class Demo {

    static void display(Greeting g) {
        g.say();
    }

    public static void main(String[] args) {


        Greeting g1 = new Greeting() {
            @Override
            void say() {
                System.out.println("Hello from anonymous class!");
            }
        };

        display(g1);

 
        display(new Greeting() {
            @Override
            void say() {
                System.out.println("Hello again!");
            }
        });
    }
}
