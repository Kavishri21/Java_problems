package samplePackage1;
import java.util.*;

public class nextGreatestLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of the array");
        int len = scan.nextInt();
        char[] arr = new char[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.next().charAt(0);
        }
        char target = scan.next().charAt(0);
        char ans = nextGreatest(arr,target);
        System.out.println(ans);
        scan.close();
    }

    static char nextGreatest(char[]arr, char target){
        int start = 0;
        int end = arr.length -1;

        while(start<=end){
            int middle = start + (end-start)/2;
            if(arr[middle]>target){
                end = middle -1;   
            }
            else{
                start = middle+1;   
            }
        }
        return arr[start%arr.length];
    }
}