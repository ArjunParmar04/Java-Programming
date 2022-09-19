package Searching;
//https://leetcode.com/problems/richest-customer-wealth/
public class Que2 {
    public static void main(String[] args) {

    }
public int maximumWealth(int[][] accounts) {

    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < accounts.length; i++) {
        //when you start a new col, take a new sum for that row
        int sum = 0;
        for (int j = 0; j < accounts[i].length; j++) {
            sum += accounts[i][j];
        }

        //now we have sum of accounts of person
        if (sum > ans){
            ans = sum;
        }
    }
    return ans;
}
}
