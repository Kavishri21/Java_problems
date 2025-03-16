package samplePackage1;
import java.util.*;

public class lastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = scan.nextInt();

        int ans = funcc(n);
        System.out.println("the last digit is: "+ans);
        
        scan.close();

    }

    static int funcc(int n){
        int remain;
        remain = n%10;
        return remain;
    }

}
