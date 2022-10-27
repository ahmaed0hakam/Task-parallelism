public class min extends Main implements Runnable {

    @Override
    public void run() {
        int m=arr[0];
        for (int i=1; i< arr.length; i++){
            if (arr[i]<m)
                m=arr[i];
        }
        m_min=m;

    }
}
