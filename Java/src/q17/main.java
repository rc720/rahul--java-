package q17;
class Main {
    static void method3() {
        int[] arr = new int[3];
        arr[5] = 10;  
    }

    static void method2() {
        method3(); 
    }

    static void method1() {
        method2();   
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}