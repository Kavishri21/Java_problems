//leetcode problem - 1295

package samplePackage1;
import java.util.*;

public class evenDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int len = scan.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=scan.nextInt();
        }

        int ans = findNumbers(nums);
        System.out.println("the number of even number of digits in this array is: "+ ans );

        scan.close();

    }


    static int findNumbers(int[] nums){
        int cout = 0;
        for (int i = 0; i < nums.length; i++) {
            
            int num = nums[i];
            if(even(num)){
                cout = cout+1;
            }
        }
        return cout;
            
    }

    static boolean even(int num){
        int cnt = digit(num);
        if(cnt%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    static int digit(int num){
        if(num<0){
            num = num*-1;
        }
        if(num==0){
            return 1;
        }
        int count = 0;
        while(num>0){
            num = num/10;
            count = count+ 1;
        }
        return count;

    }
    
}
