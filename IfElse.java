import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary : ");
        int salary = sc.nextInt();

        if (salary > 10000){
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println("Your Salary with bonus is : " + salary);
    }
}
