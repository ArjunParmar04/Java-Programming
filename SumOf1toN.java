import java.util.Scanner;

public class SumOf1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter End Point : ");
        int EndPoint = sc.nextInt();
        int ans = sumOf1toN(EndPoint);
        System.out.println("The Sum of 1 to Your Number is : " + ans);
    }


    static int sumOf1toN(int EndPoint) {
        int sum = 0;

        for (int i = 1; i <= EndPoint; i++){
            sum += i;
        }
        return sum;
    }
}