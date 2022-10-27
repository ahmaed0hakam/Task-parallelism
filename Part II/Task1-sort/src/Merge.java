public class Merge extends Main implements Runnable{
    @Override
    public void run() {
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
    }
}
