package samplePackage1;
import java.util.*;

public class squareRootBinSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number to find its square root and square: ");
        int n = scan.nextInt();
        int anss = squareRoot(n);
        System.out.println("the square root is: "+anss);
        boolean ansss = square(n);
        System.out.println("the fact that the given number is a square number is: "+ansss);
        scan.close();
    }

    static int squareRoot(int n){
        int start = 0;
        int end = n;
        int ans = 0;

        while(start<=end){
            int mid = start+(end-start)/2;
            long square = (long) mid*mid;
            if(square==n){
                return mid;
            }
            else if(square>n){
                end=mid-1;
            }
            else{
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
    static boolean square(int n){
        int start = 0;
        int end = n;

        while(start<=end){
            int mid = start+(end-start)/2;
            long square = (long) mid*mid;
            if(square==n){
                return true;
            }
            else if(square>n){
                end=mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}
