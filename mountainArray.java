package samplePackage1;
import java.util.*;

//https://leetcode.com/problems/find-peak-element/description/
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class mountainArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of the array(give input like first in ascending and in descending order): ");
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int ans = PeakIndex(arr);
        System.out.println(ans);
        System.out.println(arr[ans]);

        scan.close();
        
    }
    static int PeakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int middle = start + (end-start)/2;

            if(arr[middle]>arr[middle+1]){
                end = middle;
                //you are in descending part of the array
                //this may be the answer or u have to check in left
            }
            else{
                start = middle+1;
                //u are in ascending part of the array
                //since mid is anyways lesser than mid+1 check the right side 
            }

        }
        return start; //or end as start and end will point to the same element
    }
}
