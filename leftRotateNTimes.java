import java.util.*;
public class leftRotateNTimes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp[]=new int[n];

        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int N=sc.nextInt();

        N=N%n;
        for(int i=0;i<n;i++){
            temp[i]=arr[(i+N)%n];
        }
        for(int i=0;i<n;i++)
            System.out.print(temp[i]+" ");
    }
}