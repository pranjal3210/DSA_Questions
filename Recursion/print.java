package Recursion;
import java.util.*;

public class print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n,1);
    }
    public static void print(int n,int ans){
        System.out.print(ans+" ");
        if(ans==n){
            return;
        }
        print(n,ans+1);
    }
}
