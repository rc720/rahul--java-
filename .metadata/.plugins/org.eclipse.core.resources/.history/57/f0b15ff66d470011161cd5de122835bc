package q23;
class SharedResource {
 boolean available = false;
 synchronized void produce(String item) throws InterruptedException {
     while (available) {
         wait();                
     }
     System.out.println("Produced: " + item);
     available = true;
     notify();                 

 synchronized void consume() throws InterruptedException {
     while (!available) {
         wait();               
     }
     System.out.println("Consumed item");
     available = false;
     notify();                 
 }
}
public class Main {
 public static void main(String[] args) {
     SharedResource res = new SharedResource();

     Thread producer = new Thread(() -> {
         try {
             res.produce("Medicine");
             res.produce("Report");
         } catch (InterruptedException e) { e.printStackTrace(); }
     });
     Thread consumer = new Thread(() -> {
         try {
             res.consume();
             res.consume();
         } catch (InterruptedException e) { e.printStackTrace(); }
     });
     producer.start();
     consumer.start();
 }
}