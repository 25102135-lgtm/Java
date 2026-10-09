package basics;

import java.util.Scanner;

public class Q5_best4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first subject marks : ");
        int first=sc.nextInt();

         System.out.print("Enter second subject marks : ");
        int second=sc.nextInt();

        System.out.print("Enter third subject marks : ");
        int third=sc.nextInt();

        System.out.print("Enter forth subject marks : ");
        int forth=sc.nextInt();

        System.out.print("Enter fifth subject marks : ");
        int fifth=sc.nextInt();

        int min=first;

        if(second<min)
        { min=second;}

        if(third<min)
        {min=third; }

        if(forth<min)
        {min=forth; }

        if(fifth<min)
        {min=fifth; }

        System.out.print("Percentage : " +((first+second+third+forth+fifth-min)*100)/400);



    }
    
}
