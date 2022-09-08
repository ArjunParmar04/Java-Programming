import java.util.Scanner;

public class TskeInputAndSum {
    public static void main(String[] args) {
        int ans = takeInputAndSum();
        System.out.println("The Sum is " + ans);
    }

    static int takeInputAndSum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Num 2 : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}
