import java.util.*;
public class Main {
    public static Scanner oh= new Scanner(System.in);
    public static int num=oh.nextInt();
    public static void main(String[] args) throws InterruptedException {
        Prime u= new Prime();
        u.start();
        u.join();
    }
}
