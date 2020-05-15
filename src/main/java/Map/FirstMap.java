package Map;


public class FirstMap {

    private static int num = 0;

    public static void add3(){
        num = num + 3;
    }

    public static void add5(){
        num = num + 5;
    }


    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                add3();
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                add5();
            }
        });
        t2.start();

        while(num < 1000){

        }




    }

}
