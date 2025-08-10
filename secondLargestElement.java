import java.util.*;
public class secondLargestElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max2 && arr[i]!=max){
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}