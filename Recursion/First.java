package Recursion;
public class First {
    public static void main(String[] args) {
        num(1);
    }

    public static void num(int n){
        if (n == 5)  {
            System.out.println(n);
            return;
        }
    
        System.out.print(n + ", ");
        num(n + 1);
    }
}
