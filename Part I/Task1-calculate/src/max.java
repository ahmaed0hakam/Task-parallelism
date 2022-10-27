public class max extends Main implements Runnable {
    @Override
    public void run() {
        int m= array[0];
        for (int i = 1; i< array.length; i++){
                m=Math.max(m, array[i]);
        }
        var_max =m;

    }
}

