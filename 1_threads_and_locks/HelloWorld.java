public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread() {
                public void run() {
                    System.out.println("Hello from new Thread");
                }
            };
        myThread.start();
        Thread.yield();
        System.out.println("Hello from main Thread");
        myThread.join();
    }
}
