import java.util.Arrays;
import java.util.Arrays;
public class Main {
    protected static int basic_array[] = {2, 0, 1, 4, 3, 5, 8, 6, 7, 10, 9, 11};
    protected static int part1[] = new int[basic_array.length / 4];
    protected static int part2[] = new int[basic_array.length / 4];
    protected static int part3[] = new int[basic_array.length / 4];
    protected static int part4[] = new int[basic_array.length / 4];
    protected static int merge_array[] = new int[basic_array.length];

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        for (int i = 0; i < basic_array.length / 4; i++) {
            part1[i] = basic_array[i];
        }
        Arrays.sort(part1);


            int s = basic_array.length / 4;
            for (int i = 0; i < basic_array.length / 4; i++) {
                part2[i] = basic_array[s++];
            }
            Arrays.sort(part2);


            s = basic_array.length / 2;
            for (int i = 0; i < basic_array.length / 4; i++) {
                part3[i] = basic_array[s++];
            }
            Arrays.sort(part3);


            s = basic_array.length / 2 + basic_array.length / 4;
            for (int i = 0; i < basic_array.length / 4; i++) {
                part4[i] = basic_array[s++];
            }
            Arrays.sort(part4);

        int save1=0;
        int save2=0;
        int save3=0;
        int save4=0;


        for (int i=0; i< basic_array.length/4; i++){
            merge_array[i]=part1[i];
            save1=i;
        }
        save1++;
        for (int i=0; i< basic_array.length/4; i++){
            merge_array[save1++]=part2[i];
            save2=save1;
        }

        for (int i=0; i< basic_array.length/4; i++){
            merge_array[save2++]=part3[i];
            save3=save2;
        }

        for (int i=0; i< basic_array.length/4; i++){
            merge_array[save3++]=part4[i];
        }

        for (int i=0; i< basic_array.length;i++){
            System.out.print(merge_array[i]+" ");
            if(((i+1)%(basic_array.length/4)==0)&&i!=0) System.out.print(" ");

    }
        long endTime = System.nanoTime();
        long elapsedTime= endTime - startTime;
        System.out.println("\nExecution time in nanoseconds: " + elapsedTime);
}
}

