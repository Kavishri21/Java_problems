package samplePackage1;
import java.util.*;

public class countDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = scan.nextInt();

        int ans = funcc(n);
        System.out.println("the number of digits in " + n + " is " + ans);

        scan.close();
        
    }

    static int funcc(int n){
        int digit = 0;
        while(n>0){
            n = n/10;
            digit = digit+1;
        }
        return digit;        
    }
}
