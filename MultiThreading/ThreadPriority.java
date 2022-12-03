package MultiThreading;

public class ThreadPriority extends Thread {

    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();

        t1.setPriority(3);
        t2.setPriority(5);
//        t3.setPriority(8);
        System.out.println("Current Thread : " + Thread.currentThread().getName());
        System.out.println("Current Thread : " + Thread.currentThread().getPriority());

        System.out.println("t3 priority : " + t3.getPriority());
    }

    public void run() {
        System.out.println("Hello");
    }
}
