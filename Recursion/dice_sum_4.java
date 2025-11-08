package Recursion;

import java.util.Scanner;

public class dice_sum_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reaching_ways(n,"",0);
    }
    public static void reaching_ways(int n,String ans,int sum){
        if(sum==n){
            System.out.print(ans+" ");
            return;
        }
        if(sum>n){
            return;
        }
        reaching_ways(n, ans+1, sum+1);
        reaching_ways(n, ans+2, sum+2);
        reaching_ways(n, ans+3, sum+3);
      
    }
}
