package samplePackage1;
import java.util.*;


public class sumOfnNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the n: ");
        int n = scan.nextInt();
        int result = sum(n);
        System.out.println("the sum of all " + n + "numbers is: " + result);
        scan.close();
    }

    static int sum(int n){

        int total = 0;
        for(int i = 0;i<=n;i++){
            total = total+i;
        }
        return total;
    } 
}
