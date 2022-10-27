public class Main {
    protected static int[] arr = {90, 81, 78, 95, 79, 72};
    protected static int m_max, m_min;
    protected static double m_avg;

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();

        max runnable1= new max();
        Thread t1= new Thread(runnable1);

        min runnable2= new min();
        Thread t2= new Thread(runnable2);

        avg runnable3= new avg();
        Thread t3= new Thread(runnable3);

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println("The maximum value is " + m_max);
        System.out.println("The minimum value is " + m_min);
        System.out.println("The average value is " + m_avg);
        long endTime = System.nanoTime();
        long elapsedTime= endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + elapsedTime);

    }
}
