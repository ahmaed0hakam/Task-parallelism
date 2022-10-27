import java.util.*;
public class Main {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner oh= new Scanner(System.in);
        int num=oh.nextInt();
        boolean c=false;
        for (int j=num; j>1; j--){
            c=false;
            for (int i=j-1; i>1; i--){
                if(j%i==0){
                    c=true;
                    break;
                }

            }
            if(c==false) System.out.println(j);

        }
        long endTime = System.nanoTime();
        long elapsedTime= endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + elapsedTime);

    }
}
