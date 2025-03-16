package samplePackage1;
import java.util.*;

public class powerOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the base number: ");
        int a = scan.nextInt();
        System.out.println("enter the power number: ");
        int b = scan.nextInt();

        int ans = funcc(a,b);
        System.out.println("the power is: " + ans);

        scan.close();
    }

    static int funcc(int a, int b){
        if(b==0){
            return 1;
        }
        int power = 1;
        for (int i = b; i > 0; i--) {
            power=power*a;
        }
        return power;
    }
}
