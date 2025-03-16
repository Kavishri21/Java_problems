package samplePackage1;
import java.util.*;

public class GCDEuclidean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a = scan.nextInt();
        System.out.println("enter the second number: ");
        int b = scan.nextInt();

        int ans1 = funcc(a,b);
        System.out.println("the 1st anser through recursive method is: " + ans1);

        int ans2 = funcc(a,b);
        System.out.println("the 2nd answer through iterative method is: "+ ans2);

        scan.close();
    }

    static int funcc(int a,int b){
        if(b==0){
            return a;
        }
        return funcc(b,a%b);
    }

    static int funcc2(int a,int b){
        while(b>0){
            int temp = b;
            b = a%b;
            a= temp;
        }
        return a;
    }
}
