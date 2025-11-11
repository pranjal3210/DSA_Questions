package Recursion;
import java.util.*;
public class generate_parentheses {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> ll=new ArrayList<>();
        print_parenthesis(n, 0, 0,"",ll);
        System.out.print(ll);
    }
    public static void print_parenthesis(int n,int open,int close,String ans,List<String> ll){
        if(open==n && close==n){
            ll.add(ans);
            return;
        }
        if(open<n){
            print_parenthesis(n, open+1, close, ans+'(',ll);
        }
        if(close<open){
            print_parenthesis(n, open, close+1, ans+')',ll);
        }
    }
}
