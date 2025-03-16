//leetcode - 3232 : https://leetcode.com/problems/find-if-digit-game-can-be-won/description/

package samplePackage1;
import java.util.*;

public class digitGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of elements in array: ");
        int row = scan.nextInt();
        int[] nums = new int[row];
        for(int i = 0; i<nums.length; i++){
            nums[i]=scan.nextInt();
        }

        boolean ans = canAliceWin(nums);
        System.out.println(ans);
        scan.close();

    }

    static boolean canAliceWin(int[] nums){
        int sum1 = 0;
        int sum2 = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]/10==0){
                sum1 = nums[i] + sum1;
            }
            else{
                sum2 = nums[i] + sum2;
            }
        }
        if(sum1>sum2 || sum2>sum1){
            return true;
        }
        else{
            return false;
        }

    }




}
