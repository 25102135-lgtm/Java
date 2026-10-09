package Number_System;
import java.util.*;

public class dec_bin{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the No. of digits  : ");
        int n = sc.nextInt();

        int a[]= new int[n];

        System.out.println("Enter the Number : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            if(a[i]!=0 && a[i]!= 1){
                System.out.print("invalid input ");
                return;
            }
        }

        System.out.println("The decimal of "+Arrays.toString(a)+" : "+decimal_num(a));
        sc.close();

    }
    static int decimal_num(int a[]){
          int sum=0;
        for(int i=a.length-1;i>=0;i--){
           int j=a.length-1-i;
          
            sum=sum+a[i]*(int)Math.pow(2,j);
            }
            return sum;
        }
    }
