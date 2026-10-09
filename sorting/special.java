package sorting;

import java.util.*;
public class special {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the no. of elements : ");
        int n = sc.nextInt();

        int [] a=new int [n]; /*  array implementation creating space for array in memory*/
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);
        System.out.println("sorted array : "+Arrays.toString(a));
    }
}