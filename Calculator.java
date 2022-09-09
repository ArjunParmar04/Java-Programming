import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int n2 = sc.nextInt();

        System.out.print("Enter Oprator : ");
        char op = sc.next().charAt(0);

        switch (op){
            case '+' :
                System.out.println("The sum is : " + (n1 + n2));
                break;
            case '-' :
                System.out.println("The Substraction is : " + (n1 - n2));
                break;
            case '*' :
                System.out.println("The Multiplication is : " + (n1 * n2));
                break;
            case '/' :
                if (n2 != 0) {
                    System.out.println("The Division is : " + (n1 / n2));
                }else {
                    System.out.println("The Division is : 0");
                }
                break;
        }

    }
}
