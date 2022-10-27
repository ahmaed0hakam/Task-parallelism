public class Main {
    protected static int basic_array[]={2, 0, 1, 4, 3, 5, 8, 6, 7, 10, 9, 11};
    protected static int part1[]=new int[basic_array.length/4];
    protected static int part2[]=new int[basic_array.length/4];
    protected static int part3[]=new int[basic_array.length/4];
    protected static int part4[]=new int[basic_array.length/4];
    protected static int merge_array[]=new int[basic_array.length];

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();
        Sort s1= new Sort(0);
        Thread p1= new Thread(s1);
        Sort s2= new Sort(basic_array.length/4);
        Thread p2= new Thread(s2);
        Sort s3= new Sort(basic_array.length/2);
        Thread p3= new Thread(s3);
        Sort s4= new Sort(basic_array.length/2+ basic_array.length/4);
        Thread p4= new Thread(s4);
        Merge m= new Merge();
        Thread p5= new Thread(m);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.start();
        p5.join();
        for (int i=0; i< basic_array.length;i++){
            System.out.print(merge_array[i]+" ");
            if(((i+1)%(basic_array.length/4)==0)&&i!=0) System.out.print(" ");
        }
        long endTime = System.nanoTime();
        long elapsedTime= endTime - startTime;
        System.out.println("\nExecution time in nanoseconds: " + elapsedTime);
    }
}
