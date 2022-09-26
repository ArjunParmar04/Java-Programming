public class ExceptionHand {
    public static void main(String[] args) {
        //there are many exception like Arithmetic Exception,
//        IndexOutOfBoundsException, NullPointerEx. , NumberFormaEx.
//        
    try{
//        System.out.println(10/0);
        String s = null;
        System.out.println(s.length());//NullPointerEx.
    } catch (Exception e){
        System.out.println(e);
//        System.out.println("Arithmetic Ex. occured..." + e);
    }
    }
}
