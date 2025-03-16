
// this program is to search the target element in the 2d arrays and give the maximim element from that

package samplePackage1;
import java.util.*;

public class twoDArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int a = scan.nextInt();
        System.out.println("enter the number of columns: ");
        int b = scan.nextInt();
        int[][] arr = new int[a][b];

        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j<arr[i].length;j++){
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("enter the target element to be searched: ");
        int target = scan.nextInt();

        int ans[] = search(arr,target);
        // System.out.println("the "+target+ " is found in the position "+ ans); this will give the direct address bcox we r printing array
        System.out.println("the "+target+ " is found in the position "+ Arrays.toString(ans));

        int maxxx = maxx(arr);
        System.out.println("the maximum element in the 2D array is: " + maxxx );


        scan.close();

    }

    static int[] search(int[][]arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
            
        }
        return new int[]{-1,-1};
    }

    static int maxx(int[][]arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }  
        }
        return max;

    }
}
