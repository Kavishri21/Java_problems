package samplePackage1;
import java.util.*;

public class patterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of n or rows: ");
        int n = scan.nextInt();
        //pattern3(n);
        pattern4(n);
        scan.close();
    }

    static void pattern3(int n){
        for (int i = n; i >= 1; i--) {
            for(int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //this can also be ran through this method
        for(int i =0;i<=n;i++){
            for(int j = 0;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
