import java.util.Arrays;
public class Sort extends Main implements Runnable{
    int start;
    Sort(int start){
        this.start=start;
    }

    @Override
    public void run() {
        if(start==0){
            for (int i = 0; i< basic_array.length/4; i++){
                part1[i]= basic_array[i];
            }
            Arrays.sort(part1);
        }
        if(start== basic_array.length/4){
            int s=start;
            for (int i = 0; i< basic_array.length/4; i++){
                part2[i]= basic_array[s++];
            }
            Arrays.sort(part2);
        }
        if(start== basic_array.length/2){
            int s=start;
            for (int i = 0; i< basic_array.length/4; i++){
                part3[i]= basic_array[s++];
            }
            Arrays.sort(part3);
        }
        if(start== basic_array.length/2+ basic_array.length/4){
            int s=start;
            for (int i = 0; i< basic_array.length/4; i++){
                part4[i]= basic_array[s++];
            }
            Arrays.sort(part4);
        }
    }
}
