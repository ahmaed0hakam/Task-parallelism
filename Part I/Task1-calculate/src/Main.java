public class Main {
    public static int[] array = {66, 52, 43, 99, 80, 60};
    public static double var_max, var_min, var_avg;
    public static void main(String[] args) throws InterruptedException {
        max my_thread1= new max();
        min my_thread2= new min();
        avg my_thread3= new avg();
        Thread thread1= new Thread(my_thread1);
        Thread thread2= new Thread(my_thread2);
        Thread thread3= new Thread(my_thread3);
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("The maximum value is " + var_max);
        System.out.println("The minimum value is " + var_min);
        System.out.println("The average value is " + var_avg);

    }
}
