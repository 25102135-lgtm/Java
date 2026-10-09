package sorting;

import java.util.Arrays;

// import java.util.Scanner;
public class selection_sort {
public static void main(String[] args) {
   // Scanner  sc = new Scanner(System.in);
    int arr[]={2,1,3,5,4,};
    System.out.println("given array is : "+Arrays.toString(arr));

    selectionSort(arr);
    System.out.println("sorted array : "+Arrays.toString(arr));

}

    static void selectionSort(int[] a)
    {
        int n = a.length;
        int temp;
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<=n-1;j++)
            {
                if(a[min]>a[j]) // for descend order change > to "<"
                {
                    min=j;
                }
            }
            // swapping
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
    }
}
