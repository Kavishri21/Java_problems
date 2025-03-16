package samplePackage1;
import java.util.*;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = scan.nextInt();

        int ans = funcc(num);
        if(ans == num){
            System.out.println("it is a perfect number");
        }
        else{
            System.out.println("it is not a perfect number");
        }

        scan.close();

    }

    static int funcc(int num){
        int sum = 0;
        for (int i = 1; i <num ; i++) {
            if(num%i==0){
                sum = sum+i;
            }
        }
        return sum;
    }
}
