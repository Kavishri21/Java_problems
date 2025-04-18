package samplePackage1;
import java.util.*;
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

public class patterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of n or rows: ");
        int n = scan.nextInt();
        //pattern3(n);
        //pattern4(n);
        //patterns5(n);
        patterns6(n);
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

    static void patterns5(int n){
        for (int row = 1; row < 2*n; row++) {
            int c = 0;
            if(row>n){
                c = 2*n - row; //n-(row-n)
            }
            else{
                c = row;
            }
            for(int j = 1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void patterns6(int n){
        for (int i = 1; i <= n; i++) {
            for(int space=n-i;space>=0;space--){
                System.out.print(" ");
            }
            for(int c =1;c<=i;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
