package samplePackage1;
import java.util.*;

public class GCD {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a = scan.nextInt();
        System.out.println("enter the second number: ");
        int b = scan.nextInt();

        int ans = funcc(a,b);
        System.out.println("the gcd of "+a+" and "+b+" is: "+ans);

        scan.close();

    }

    static int funcc(int a, int b){
        if(a==0 || b==0){
            return Math.max(a, b);
        }

        int result = Math.min(a,b);
        while(result>0){
            if(a%result==0 && b%result==0){
                return result;
            }
            result = result-1;
        }
        return 1;

    }
}