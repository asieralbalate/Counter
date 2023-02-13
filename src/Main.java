public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyRunnable runnable1 = new MyRunnable(counter);
        MyRunnable runnable2 = new MyRunnable(counter);
        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.value());
    }
}
