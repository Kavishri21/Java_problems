package samplePackage1;
import java.util.*;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number to be reversed: ");
        int n = scan.nextInt();

        int ans = funcc(n);
        System.out.println("the rversed version of " +n+ " is " + ans);

        scan.close();
    }

    static int funcc(int n){
        int num = 0;
        int reverse = 0;
        while(n>0){
            num = n%10;
            reverse = (reverse*10) + num;
            n=n/10;
        }
        return reverse;
    }

}
