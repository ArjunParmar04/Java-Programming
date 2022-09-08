import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to get the factorial : ");
        int num = sc.nextInt();
//        System.out.println(fact(num));
        System.out.println(fact1(num));
    }


    //simple method
    static int fact(int num){
        int ans = 1;
        for (int i = 1; i <= num; i++){
            ans *= i;
        }
        return ans;
    }

    //using recursion
    static int fact1(int num){
        if (num == 0){
            return 1;
        }

        return (num * fact1(num-1));
    }

}
