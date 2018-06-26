public class Observer {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Hello world 11!");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                System.out.println("Hello world 22!");
            }
        });
        t1.start();
        t2.start();
    }
}
