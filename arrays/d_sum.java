package arrays;

import java.util.*;

public class d_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int x= sc.nextInt();
        System.out.print("Enter the no. of column : ");
        int y=sc.nextInt();

        int a[][]= new int[x][y];

        int sum=0;
        System.out.println("Enter the Elements");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                a[i][j]=sc.nextInt();
                // System.out.print(a[i][j]+" ");
                   System.out.printf("%4d", a[i][j]);
                sum+=a[i][j];
            }
              System.out.println();

        }

        System.out.print("Sum : "+sum);
        
    }
    
    
}
