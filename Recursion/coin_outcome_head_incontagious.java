package Recursion;

import java.util.Scanner;

public class coin_outcome_head_incontagious {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print_coin_outcome(n,"");
    }
    public static void print_coin_outcome(int n,String ans){
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H'){
            print_coin_outcome(n-1, ans+"H");
        }
        
        print_coin_outcome(n-1, ans+"T");
    }
}
