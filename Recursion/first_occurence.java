package Recursion;
import java.util.*;
public class first_occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.print(search(arr,target,0));

    }
    public static int search(int[] arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        int ans =search(arr, target, i+1);
        return ans;
    }
}
