package Recursion;
import java.util.*;
public class coin_toss{
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

        print_coin_outcome(n-1, ans+'H');
        print_coin_outcome(n-1, ans+'T');
    }
}