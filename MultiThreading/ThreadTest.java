package MultiThreading;
//With a perticular class or another class

//class MyThread extends Thread{
//    public void run(){
//        int i = 1;
//        while (true){
//            System.out.println(i + " Hello");
//            i++;
//        }
//    }
//}
//public class ThreadTest{
//    public static void main(String[] args) {
//        MyThread t = new MyThread();
//        t.start();
//
//        int i = 1;
//        while (true){
//            System.out.println(i + " World");
//            i++;
//        }
//    }
//}


//In Main class
class MyThread extends Thread {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }

    }

    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}
