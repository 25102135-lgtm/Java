package loops;

import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();

        int i=1;
        int fact=1;
        for(i=1;i<=num;i++)
        { fact=fact*i; }
        System.out.print("the factorial of "+num+" :"+fact);
    }
    
}
