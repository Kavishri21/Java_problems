package samplePackage1;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number to find it factorial: ");
        int a = scan.nextInt();
        int fin = factoriall(a);
        System.out.println("the facotial of "+a+" is: "+fin);
        scan.close();

    }

    static int factoriall(int a){
        if(a==0 || a==1){
            return 1;
        }
        int ans = (a * factoriall(a-1));
        return ans;
    }

}
