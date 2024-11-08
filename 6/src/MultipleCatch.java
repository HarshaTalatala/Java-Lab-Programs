public class MultipleCatch {
    public static void main(String[] args) {
        try{
            int a = args.length;
            int b = 10/a;
            int[] c = {1,2,3,4};
            c[6] = 69;
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }
        catch (ArrayIndexOutOfBoundsException aie){
            System.out.println(aie);
        }
    }
}
