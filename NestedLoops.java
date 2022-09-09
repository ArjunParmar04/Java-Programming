public class NestedLoops {
    public static void main(String[] args) {
//        prt();
//        ptrn1();
//        ptrn2();
//        ptrn3();
//        ptrn4();
//        ptrn5();
//        ptrn6();
//        ptrn7();
//        ptrn8();
//        ptrn9();
//        ptrn10();
//        ptrn11();
        ptrn12();
    }


    //print (1,1) to (5,5) with nested loop
    static void prt(){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                System.out.print("(" + i + ", " + j + ")");
            }
            System.out.println();
        }
    }
    static void ptrn1(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void ptrn2(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void ptrn3(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void ptrn4(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void ptrn5(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void ptrn6(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
    }

    static void ptrn7(){
        int count = 1;
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    static void ptrn8(){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void ptrn9(){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    static void ptrn10(){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void ptrn11(){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                if (j >= i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void ptrn12(){
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                if (i + j > 5){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
