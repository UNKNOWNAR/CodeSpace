public class TestConcurrency{
    public static void main(String[] args) {
        Concurrency p[] = new Concurrency[5];
        for(int j=0;j<5;j++){
            p[j]=new Concurrency(j);
            p[j].start();
        }
    }
}
