public class avg extends Main implements Runnable{
    @Override
    public void run() {
        double sum=0;
        for (int i=0; i< arr.length; i++){
            sum+=arr[i];
        }
        m_avg=sum/ arr.length;
        
    }
}
