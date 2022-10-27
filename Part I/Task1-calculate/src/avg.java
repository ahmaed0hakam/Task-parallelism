public class avg extends Main implements Runnable{
    @Override
    public void run() {
        double avg=0;
        for (int i = 0; i< Main.array.length; i++){
            avg+= Main.array[i];
        }
        avg/=Main.array.length;
        Main.var_avg =avg;
        
    }
}
