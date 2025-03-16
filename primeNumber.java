package samplePackage1;
import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number to check whether it is prime or not");
        int a = scan.nextInt();

        boolean ans = isPrime(a);
        System.out.println(ans);
        
        scan.close();
    }

    static boolean isPrime(int a){
        if (a==0||a==1){
            System.out.println("neither prime nor composite");
        }
        int squareRoot=2;
        while(squareRoot<=Math.sqrt(a)){
            if(a%squareRoot==0){
                return true;
            }
            squareRoot = squareRoot+1;
        }
        return false;
    }
}
