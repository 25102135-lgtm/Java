package basics;

import java.util.Scanner;

public class Q2_percent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st subject marks : ");
        int first = sc.nextInt();

         System.out.print("Enter 2nd subject marks : ");
        int second = sc.nextInt();

         System.out.print("Enter 3rd subject marks : ");
        int third = sc.nextInt();

         System.out.print(" Percentage : " +((first+second+third)*100)/300);

         sc.close();
       
    }
    
}
