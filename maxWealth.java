//leetcode prob - 1672
//https://leetcode.com/problems/richest-customer-wealth/

package samplePackage1;
import java.util.*;

public class maxWealth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number of persons(rows): ");
        int person = scan.nextInt();
        System.out.println("enter the number of bank accounts each person should have(colimns): ");
        int account = scan.nextInt();

        System.out.println("enter the credentials: ");
        int[][] accounts = new int[person][account];
        for (int i = 0; i < person; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                accounts[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < accounts.length; i++) {
            for(int j=0; j<accounts[i].length;j++){
                System.out.print(accounts[i][j]+" ");
            }
            System.out.println();
        }

        int ans = maximumWealth(accounts);
        System.out.println("the maximum wealth is: "+ ans);

        scan.close();
    }

    static int maximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
                if(sum>max){
                    max = sum;
                }
            }
        }
        return max;

    }

}
