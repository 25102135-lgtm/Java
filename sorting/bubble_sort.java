package sorting;

import java.util.Arrays;
import java.util.Scanner;
public class bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements : ");
        int n= sc.nextInt();

        int i;
        int [] a = new int [n];
    

        for(i=0;i<n;i++)
        {
           System.out.print("Element at "+i+" index : ");
           a[i]= sc.nextInt();
        }


         System.out.print("given array : "+Arrays.toString(a));
       /*   for(i=0;i<n;i++)
        { System.out.print(a[i]+" "); } */
         

        bubbleSort(a);
        System.out.print("\n sorted array : "+Arrays.toString(a));
       /* for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        } */
    }
    

    static void bubbleSort(int [] arr)
    {
        int n= arr.length;
        for(int i=0;i<n-1;i++)
        {
            int temp;
        
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        
        }
    }
}
