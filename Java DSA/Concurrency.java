public class Concurrency extends Thread{
    private int id;
    public Concurrency(int i){id=i;}
    public void run(){
        for(int j=0;j<100;j++){
            System.out.println("My id is"+id);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){}

        }
    }
}
