package samplePackage1;
import java.util.*;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = scan.nextInt();
        int ans = fibo(num);
        System.out.println(ans);
        scan.close();
        
    }

    static int fibo(int n){
        if(n<2){
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }

}
