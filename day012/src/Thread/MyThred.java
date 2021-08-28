package Thread;

public class MyThred {
    public static void main(String[] args) {
        Demo01Thread myThread = new Demo01Thread();
        myThread.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println("main:" +i);
        }

    }
}