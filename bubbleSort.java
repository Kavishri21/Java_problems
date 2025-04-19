package samplePackage1;
import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the lenght of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the "+i+"th element(not in order): ");
            arr[i] = scan.nextInt();
        }
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        scan.close();
    }

    static void bubble(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //we r doing this to skip the iteration when the array is already sorted
            //so when i=0, there happens no swap means the array is sorted
            //by using this, since the swapped value is false the loop will break without checking i=1 or greater
            for (int j =1;j<arr.length;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            if(swapped==false){
                break;
            }
        }
    }
    
}
