//leetcode - 2180 - https://leetcode.com/problems/count-integers-with-even-digit-sum/description/
/*
Given a positive integer num, return the number of positive integers less than or equal to num 
whose digit sums are even.
Input: num = 30
Output: 14
Explanation:
The 14 integers less than or equal to 30 whose digit sums are even are
2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.
 */

package samplePackage1;
import java.util.*;

public class evenDigitSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = scan.nextInt();

        int ans = countEven(num);
        System.out.println("the number of digits less than or equal to that number having digit sums as even is: "+ ans);

        scan.close();
    }

    static int countEven(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            int digSum = digitSum(i);
            if(digSum%2==0){
                System.out.print(i+" ");
                count = count +1;
            }
        }
        return count;
        
    }
    static int digitSum(int i){
        int sum = 0;
        while(i>0){
            int rem = i%10;
            sum = sum+rem;
            i = i/10;
        }
        return sum;
    }
}