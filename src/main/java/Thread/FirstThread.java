package Thread;

public class FirstThread extends Thread {
    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
               int time = (int) (Math.random() * 1000);
               Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            FirstThread f1 = new FirstThread();
            f1.setName("myThread");
            f1.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
