import java.util.*;
public class Main {
    public static Scanner oh= new Scanner(System.in);
    public static int num=oh.nextInt();
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();
        Prime u= new Prime();
        u.start();
        u.join();
        long endTime = System.nanoTime();
        long elapsedTime= endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + elapsedTime);
    }
}
