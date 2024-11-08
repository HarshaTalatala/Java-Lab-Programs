import java.util.*;
class Roots {
    public static void main(String[] args) {
        double r1,r2,a,b,c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a ,b ,c values : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        d = b*b-4*a*c;

        if(d == 0){
            System.out.println("Roots are real and equal : ");
            r1 = r2 = -b/2*a;
            System.out.println("r1 = "+r1);
            System.out.println("r2 = "+r2);
        } else if(d>0){
            System.out.println("roots are real and distinct");
            r1 = -b+(Math.sqrt(d))/(2*a);
            r2 = -b-(Math.sqrt(d))/(2*a);
            System.out.println("r1 = "+r1);
            System.out.println("r2 = "+r2);
        }
        else{
            System.out.println("roots are imaginary");
        }
    }
}
