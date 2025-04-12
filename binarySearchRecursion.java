package samplePackage1;
import java.util.*;

public class binarySearchRecursion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the lenght of the array: ");
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            
            arr[i] = scan.nextInt();
        }
        System.out.println("enter the target element to be searched: ");
        int target = scan.nextInt();

        System.out.println(bsr(arr,target,0,(len-1)));
        scan.close();
    }

    static int bsr(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m]==target){
            return m;
        }

        if(arr[m]>target){
            return bsr(arr,target,s,m-1);
        }

        return bsr(arr,target,m+1,e);

    }
}
