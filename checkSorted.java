import java.util.Scanner;
public class checkSorted {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int arr[]=new int[n];
        int arr1[]=new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++){
            arr1[i]=arr[i];
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                    
                }
            }
        }
        boolean isSorted = true;
        for(int i=0;i<n;i++){
            if(arr1[i]!=arr[i]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
        
     }
}
