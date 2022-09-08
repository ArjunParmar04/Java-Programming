import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Point : ");
        int n = sc.nextInt();
        System.out.print("The fibonacci series is : ");
        fibo(n);
    }
    static void fibo(int num){
       int a = 0;
       int b = 1;

        System.out.print(a + ", " + b + ", ");
        for (int i = 2; i <=num; i++){
            int c = a + b;
            System.out.print(c + ", ");
            a = b;
            b = c;
        }

    }
}
