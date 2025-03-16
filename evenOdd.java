package samplePackage1;
import java.util.*;


public class evenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = scan.nextInt();
        scan.close();

        if(n%2==0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd");
        }
    }

}
