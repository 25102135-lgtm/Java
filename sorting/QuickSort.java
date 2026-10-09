package sorting;

import java.util.Scanner;
import java.util.Arrays;

public class QuickSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements : ");
        int n=sc.nextInt();

        int a[]=new int [n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.print("Given array : "+Arrays.toString(a));

        quick(a,0,n-1);
        System.out.print("\nSorted Array : "+Arrays.toString(a));
      


    }
    static void quick(int arr[], int left , int right ){
       
        
        if(left<right){
        int p= partition(arr,left,right);
        quick(arr,left, p-1);
        quick(arr,p+1,right);
    
        }

    }

    static int partition(int arr[],int left, int right){
        
        int pivot=arr[left];
        int i=left+1;
        int j=right;
        int temp;
        while(i<=j){
         while(i<=right  && arr[i]<pivot ){ // not arr[i]<pivot && i<=right
            i++;
          }
         while(arr[j]>=pivot && j>left){
            j--;
          }
         if(i<j){
            temp=arr[j]; 
            arr[j]=arr[i];
            arr[i]=temp;
         }
         else{   // if(i>=j)
            temp=pivot;    //or in short
            arr[left]=arr[j];  // temp=arr[left]
            arr[j]=temp;      // arr[left]=arr[j]
            return j;         // arr[j]=temp
            }
          }
      
          return j;
        }
    }
