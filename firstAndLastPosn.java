package samplePackage1;
import java.util.*;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/1604485067/

public class firstAndLastPosn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of the array(enter repeated numbers): ");
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("enter the target element to be searched: ");
        int target = scan.nextInt();

        int[] finAns = searchRange(arr, target);
        System.out.println(Arrays.toString(finAns));
        scan.close();
    }

    static int[] searchRange(int[] arr, int target){
        int[] ans = {-1,-1};
        ans[0] = binSearch(arr, target, true);
        if(ans[0]!=-1){
            ans[1] = binSearch(arr, target, false);
        }
        return ans;
    }
    
    static int binSearch(int[]arr, int target, boolean ifStartingIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length;

        while(start<=end){
            int middle = start + (end-start)/2;
            if(arr[middle]>target){
                end = middle-1;
            }
            else if(arr[middle]<target){
                start = middle+1;
            }
            else{
                ans = middle;
                if(ifStartingIndex){
                    end = middle-1;
                }
                else{
                    start = middle+1;
                }
            }
        }
        return ans;
    }
}
