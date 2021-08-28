package Thread;

public class Demo01Thread extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 20 ; i++){
            System.out.println("run:" + i);
        }
    }
}
