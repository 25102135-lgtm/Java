package sorting;

import java.util.Scanner;
public class insert_prac {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no. of elements : ");
        int n = sc.nextInt();

        int[] a=new int[n];

       
        for(int i=0;i<n;i++)
        {
        
           System.out.println("Element at "+i+" index : ");
             a[i]=sc.nextInt();
          System.out.print(a[i]+" ");
        }

        System.out.println("\n Sorted array : ");
        insertsort(a);
        for(int i=0;i<n;i++)
        {
           int  value=a[i];
           System.out.print(value+" ");
        }
      
    }
    static void insertsort(int [] arr)
    {
        int n = arr.length;
        for(int i=1;i<n;i++)
        {
           int temp=arr[i];
           int j;
           for(j=i-1;j>=0;j--)
           {
            if(arr[j]>temp) // for descend order change > to "<"
            {
                arr[j+1]=arr[j];
            }
            else
            {
                break;
            }
           }
           arr[j+1]=temp;
        }
    }
}
