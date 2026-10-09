package sorting;

import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the no. of elements : ");
        int n = sc.nextInt();

        int [] a=new int [n]; /*  array implementation creating space for array in memory*/
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("given array : "+ Arrays.toString(a));

        mergeSort(a);
    }
    
    static void mergeSort(int [] arr)
    {

    }
}
