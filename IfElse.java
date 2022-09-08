import java.util.*;

public class IfElse {
    public static void main(String[] args) {
//       salary();
//       oddOrEven();
//       leapYear();
        WebType();

    }

    static void oddOrEven(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Number is Even..");
        }else {
            System.out.println("Number is Odd..");
        }
    }


    static void salary(){
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
    
     static void leapYear(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = sc.nextInt();

        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0) {
                    System.out.println("It's a leap year");
                }
            }else {
                System.out.println("It's a leap year");
            }
        }
        else {
            System.out.println("It's not a leap year..");
        }
    }
    static void WebType(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Web URL : ");
        String url = sc.nextLine();

        String protocol = url.substring(0, url.indexOf(":"));
        String pro = "Protocol : ";
        if (protocol.equals("http")){
            System.out.println(pro + "Hyper Text Transfer protocol");
        }else if (protocol.equals("ftp")){
            System.out.println(pro + "File Transfer Protocol");
        }

        String ext = url.substring(url.lastIndexOf(".") + 1);
        String exte = "Extension : ";
        if (ext.equals("com")){
            System.out.println(exte + "Commercial");
        }else if (ext.equals("org")){
            System.out.println(exte + "Organization");
        } else if (ext.equals("gov")) {
            System.out.println(exte + "Government");
        }else if (ext.equals("net")){
            System.out.println(exte + "Network");
        }
    }
}
