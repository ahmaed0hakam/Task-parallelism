public class min extends Main implements Runnable {
    @Override
    public void run() {
        int m= array[0];
        for (int i = 1; i< array.length; i++){
            m=Math.min(m, array[i]);
        }
        var_min =m;

    }
}
