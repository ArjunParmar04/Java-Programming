import java.util.Scanner;

public class EasyTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
//        System.out.println("Total Digits of Numbers is : " + countDigits(n));
//        System.out.println("Reverse Number is : " + reverse(n));
//        System.out.println("Sum of Digits is : " + sumOfDigits(n));
//        System.out.println("The Number is : " + armstrong(n));
        System.out.println("The Number is polindrome? : " + polindrome(n));
    }

    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    static int reverse(int n){
        int ans = 0;
        while(n > 0 ){
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }
        return ans;
    }

    static int sumOfDigits(int n){
        int ans = 0;
        while(n > 0){
            int rem = n % 10;
            ans += rem;
            n = n / 10;
        }
        return ans;
    }
    static String armstrong(int n ){
        int ans = 0;
        int n1 = n;
        while (n > 0){
            int r = n % 10;
            ans += (r * r * r);
            n /= 10;
            if (ans == n1){
                return "Armstrong";
            }
        }
        return "Not Armstrong";
    }

    static boolean polindrome(int n){
        int ans = 0;
        int num = n;
        while(n > 0 ){
            int rem = n % 10;
            ans = ans * 10 + rem;
            n = n / 10;
        }
        return (ans == num);
    }
}