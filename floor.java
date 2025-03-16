package samplePackage1;

import java.util.Scanner;

public class floor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int length = scan.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("enter the target element: ");
        //the task is to find the greatest number which is smaller than or equal to the target
        int target = scan.nextInt();

        int ans = flooor(arr, target);
        System.out.println("the smallest no. which is greater then or equal to the "+ target + " is " + ans);
        scan.close();

    }


    static int flooor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        
        
        while(start<end){
            int middle = start +(end-start)/2;
            if(arr[middle]>target){
                end = middle - 1;
            }
            else if(arr[middle]<target){
                start = middle + 1;
            }
            else{
                return arr[middle];
            }
        }
        return arr[end];
    }
}

