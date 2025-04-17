package samplePackage1;
import java.util.*;

public class binarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int row = scan.nextInt();
        int[] arr = new int[row];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("enter the element to be searched: ");
        int target = scan.nextInt();

        //int ans = BinSearch(arr, target);
        //System.out.println("the target element is found in the position: " + ans);

        int ans1 = orderAgnostic(arr, target);
        System.out.println("the target element is found in the position: "+ ans1);

        scan.close();

    }

    static int BinSearch(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        
        while(start<end){
            int middle = start +(end-start)/2;

            if(nums[middle] > target){
                end = middle - 1;
            }
            else if(nums[middle] < target){
                start = middle + 1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }

    static int orderAgnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
       

        
        
        while(start<=end){
            int middle = start +(end-start)/2;

            if(arr[middle]==target){
                return middle;
            }
            if(arr[0]>arr[arr.length-1]){
                if(arr[middle] > target){
                    start = middle + 1;
                }
                else{
                    end = middle-1;
                }
            }
            else{
                if(arr[middle] > target){
                    end = middle - 1;
                }
                else {
                    start = middle + 1;
                }

            }
        }
        return -1;
    }
}