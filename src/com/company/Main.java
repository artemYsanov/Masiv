package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (var i = 0; i < n; i++){
            nums [i] = in.nextInt();
        }
        int min=nums[0];
        for (var i=0; i<n; i++){
            if (nums[i]< min){
                min=nums[i];
            }
        }
        int S=0;
        for(var i=0; i<n; i++){
            S=S+nums[i];
        }
        System.out.println(S/n+min);
    }
}
