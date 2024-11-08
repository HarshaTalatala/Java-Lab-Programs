import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.println("Enter a String : ");
        s1 = sc.next();
        StringBuilder s2 = new StringBuilder();
        for(int i=s1.length()-1;i>=0;i--){
            s2.append(s1.charAt(i));
        }
        if(s1.equalsIgnoreCase(s2.toString())){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
