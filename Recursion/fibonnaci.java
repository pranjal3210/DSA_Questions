package Recursion;
import java.util.*;
public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(fibo(n));
    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int a=fibo(n-1);
        int b=fibo(n-2);
        return a+b;
    }
}
