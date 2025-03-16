package samplePackage1;
import java.util.*;

public class divisorOfNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number: ");
        int a = scan.nextInt();

        System.out.println("the divisors of "+a+" is: ");
        funcc(a);
        scan.close();


    }

    static void funcc(int a){
        for (int i = 1; i <=a ; i++) {
            if(a%i==0){

                System.out.print(i + "  ");
            }
            
        }
    }

}
