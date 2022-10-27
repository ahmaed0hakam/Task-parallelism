public class Main {
    protected static int[] arr = {90, 81, 78, 95, 79, 72};
    protected static int m_max, m_min;
    protected static double m_avg;

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();

            int m=arr[0];
            for (int i=1; i< arr.length; i++){
                if (arr[i]>m)
                    m=arr[i];
            }
            m_max=m;

        m=arr[0];
        for (int i=1; i< arr.length; i++){
            if (arr[i]<m)
                m=arr[i];
        }
        m_min=m;

        double sum=0;
        for (int i=0; i< arr.length; i++){
            sum+=arr[i];
        }
        m_avg=sum/ arr.length;

        System.out.println("The maximum value is " + m_max);
        System.out.println("The minimum value is " + m_min);
        System.out.println("The average value is " + m_avg);
        long endTime = System.nanoTime();
        long elapsedTime= endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + elapsedTime);

    }
}
