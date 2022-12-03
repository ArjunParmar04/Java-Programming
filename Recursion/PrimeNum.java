package Recursion;

public class PrimeNum {
    public static void main(String[] args) {
        System.out.println(prime(7, 7));
    }
    static boolean prime(int n,int num){
        if(n == 2){
            return true;
        }
        if (num % n == 0 ) {
            return false;
        }
        return prime(n -1, num);
    }
}
