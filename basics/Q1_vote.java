package basics;

import java.util.Scanner;

public class Q1_vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter your age : ");
        int age = sc.nextInt();
       

        if(age>=18)
        
         { System.out.println("youre eligible to vote");}
        else
        { System.out.println("youre not eligible to vote");}
        

    }
    
}
