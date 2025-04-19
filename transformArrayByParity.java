package samplePackage1;
import java.util.*;

//https://leetcode.com/problems/transform-array-by-parity/description/

public class transformArrayByParity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the lenght of the array: ");
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("enter the "+i+"th element(not in order): ");
            nums[i] = scan.nextInt();
        }
        //cond(nums);
        //System.out.println(Arrays.toString(nums));
        transformArray(nums);
        System.out.println(Arrays.toString(nums));
        scan.close();
    }

    static int[] transformArray(int[] nums){
        cond(nums);
        Arrays.sort(nums);
        return nums;
    }

    static void cond(int[] nums){
        for(int i =0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
    }
}
