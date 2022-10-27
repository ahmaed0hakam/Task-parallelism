public class Prime extends Thread{
    @Override
    public void run()
        {
            boolean c=false;
            for (int j=Main.num; j>1; j--){
                c=false;
                for (int i=j-1; i>1; i--){
                if(j%i==0){
                    c=true;
                    break;
                }

            }
                if(c==false) System.out.println(j);

        }


}
}
