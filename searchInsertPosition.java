package samplePackage1;
import java.util.*;

public class searchInsertPosition {
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

        int ans = BinSearch(arr, target);
        System.out.println("the target element is found in the position: " + ans);

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
        return insertPosition(nums,target,start,end);
    }

    static int insertPosition(int[]arr,int target,int start,int end){
        int ans = 0;
        System.out.println(start);
        System.out.println(end);
        if(start==0){
            if(target<=arr[start]){
                ans = 0;
            }
            else{
                ans = 1;
            }
        }
        else if(start==arr.length-1){
            if(target>arr[start]){
                ans = arr.length;
            }
            else{
                ans = start -1;
            }
        }
        else{
            ans= start - 1;
        }
        return ans;
    }
}