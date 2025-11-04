package Recursion;
import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(fact(n));
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fn=fact(n-1);
        return fn*n;
    }
}
