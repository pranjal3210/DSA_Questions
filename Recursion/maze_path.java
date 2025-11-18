package Recursion;

import java.util.Scanner;
public class maze_path {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        maze_print(n-1, m-1, 0, 0, "");
    }
    public static void maze_print(int n,int m,int cr,int cc,String ans){
        if(cr==n && cc==m){
            System.out.print(ans+" ");
        }
        if(cr>n || cc>m){
            return;
        }
        maze_print(n, m, cr, cc+1, ans+'H');
        maze_print(n, m, cr+1, cc, ans+'V');
    }
}
