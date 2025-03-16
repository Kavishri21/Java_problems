package samplePackage1;
import java.util.*;

public class armstrongNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number to check if its armstrong number or not: ");
        int num = scan.nextInt();

        int ans = digits(num);

        int ans2=power(num,ans);
        if(ans2==num){
            System.out.println("it is an armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }

        scan.close();

    }

    static int digits(int num){
        int digit = 0;
        while(num>0){
            num = num/10;
            digit = digit+1;
        }
        return digit;
    }

    static int power(int num,int ans){
        int sum = 0;
        while(num>0){
            int n = num%10;
            sum = sum + (int) Math.pow(n, ans);
            num = num/10;

        }
        return sum;
    }

}
