package samplePackage1;
import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of array: ");
        int n = scan.nextInt();
        System.out.println("enter the array elements: ");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the " + i + " element in the array");
            arr[i] = scan.nextInt();
        }

        System.out.println("enter the target element to be searched:  ");
        int target = scan.nextInt();

        int ans = sear(arr,target);
        System.out.println("the element is found in " + ans + "th position");

        int maxxx = maxx(arr);
        System.out.println("the maximum element from the array is "+ maxxx);

        scan.close();
    }

    static int sear(int[] arr, int target){
        if (arr.length==0){
            return -1;
        } 
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    static int maxx(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}