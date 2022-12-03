package MultiThreading;

//With the help of annother class
//public class WithInterface implements Runnable {
//    public void run(){
//        int i = 1;
//        while(true){
//            System.out.println(i + " Hello");
//            i++;
//        }
//    }
//}
//
//class test{
//    public static void main(String[] args) {
//        WithInterface t = new WithInterface();
//        Thread th = new Thread(t);
//        th.start();
//
//        int i = 1;
//        while (true){
//            System.out.println(i + " World");
//            i++;
//        }
//    }
//}


//in Main class
public class WithInterface implements Runnable {
    public static void main(String[] args) {
        WithInterface t = new WithInterface();
        Thread th = new Thread(t);
        th.start();

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


