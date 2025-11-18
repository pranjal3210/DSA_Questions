package Recursion;
import java.util.Scanner;
public class letter_combination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ques=sc.nextLine();
        String[] code= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        print(ques,"", code);
    }
    public static void  print(String ques,String ans,String[] code){
        if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch=ques.charAt(0);
		String press=code[ch-48];
		for(int i=0;i<press.length();i++) {
			print(ques.substring(1),ans+press.charAt(i),code);
		}
    }
}
