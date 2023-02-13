public class MyRunnable implements Runnable {

    private Counter counter;

    public MyRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            counter.increment();
        }
    }
}
