package Thread;

public class SaleThread extends Thread {
    private int count = 5;
    @Override
    synchronized public void run(){
        super.run();
        count --;
        System.out.println("由 " + this.currentThread().getName() + "计算count=" + count);
    }

    public static void main(String[] args) {
        SaleThread s = new SaleThread();
        Thread t1 = new Thread(s,"A");
        Thread t2 = new Thread(s,"B");
        Thread t3 = new Thread(s,"C");
        Thread t4 = new Thread(s,"D");
        Thread t5 = new Thread(s,"F");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
