
public class Main {
    public static void main(String[] args) {
        int threadCount = 5;
        BreakThread breakThread = new BreakThread(threadCount);
        ThreadController threadController = new ThreadController(threadCount, breakThread);

        new Thread(breakThread).start();
    }
}