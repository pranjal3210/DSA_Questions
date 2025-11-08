package Recursion;
import java.util.*;
public class count_subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ques="abc";
        System.out.print(count(ques,""));
    }
    public static int count(String ques,String a){
        if(ques.length()==0){
            System.out.println(a);
            return 1;
        }
        char ch=ques.charAt(0);
        int c1=count(ques.substring(1),a);
        int c2=count(ques.substring(1),a+ch);
        return c1+c2;
    }
}
