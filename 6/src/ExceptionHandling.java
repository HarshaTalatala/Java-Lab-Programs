public class ExceptionHandling {
    public static void main(String[] args) {
        int a,b;
        try{
            a = 0;
            b = 5/a;
        }catch (ArithmeticException ae){
            System.out.println("Can't perform Division by Zero");
        }
        System.out.println("After catch statement");
    }
}
