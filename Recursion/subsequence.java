package Recursion;
import java.util.*;
public class subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ques=sc.nextLine();
        sub_sequence(ques,"");
    }
    public static void sub_sequence(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=ques.charAt(0);
        sub_sequence(ques.substring(1), ans);
        sub_sequence(ques.substring(1), ans+ch);

    }
}
