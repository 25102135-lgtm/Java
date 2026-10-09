package sorting;

import java.util.Scanner;

public class insert_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertSort(arr);
        System.out.print("Sorted array : ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j;
            int temp = arr[i];
       
            for( j = i - 1;j>=0; j--)
            {
                if(arr[j]>temp)
                {
                    arr[j+1]=arr[j];
                }
                else
                {
                    break;
                }
            }
            arr[j+1]=temp;
          /*while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;*/
        }
    }
}
