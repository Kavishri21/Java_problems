package samplePackage1;
import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number to check if it is palindrome or not: ");
        int a = scan.nextInt();
        
        boolean ans = isPalindrome(a);
        System.out.println("the fact that the given number is palindrome is "+ans);
        scan.close();

    }

    static boolean isPalindrome(int a){
        int orig = a;
        int revNUm = 0;
        while(a>0){
            revNUm = revNUm*10 + a%10;
            a=a/10;
        }
        if(orig == revNUm){
            return true;
        }
        return false;

    }

}
