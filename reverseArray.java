package samplePackage1;
import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the elements in array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the " + arr[i] + "th element: ");
            arr[i] = scan.nextInt();
            scan.close();
            
        }

        System.out.println("The original array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        max(arr);
        System.out.println("the reversed array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void max(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
        
     static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

     }
        
        
        
    
}
