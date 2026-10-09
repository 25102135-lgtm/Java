package sorting;

import java.util.*;
import java.util.Arrays;

public class QuickSortPrac{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of element : ");
        int n = sc.nextInt();
        int a[]=new int [n];

        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

        System.out.print("Given Array : "+ Arrays.toString(a));
        quick(a,0,n-1);
        System.out.print("\nSorted Array : "+Arrays.toString(a));
    }
    static void quick(int arr[],int left, int right){
        if(left<right){
            int p=partition(arr,left,right);
            quick(arr,left,p-1);
            quick(arr,p+1,right);
        }
    }
    static int partition(int arr[], int left, int right) {
        int i=left+1;
        int j = right;
        int temp;
        while(i<=j){
        while(i<=j && arr[i]<arr[left]){
            i++;}
        while(j>left && arr[j]>=arr[left]){
            j--;}
        if(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        else{
            temp=arr[j];
            arr[j]=arr[left];
            arr[left]=temp;
            return j;
        }
     }

        
        
        
        return j;
        
    }
}