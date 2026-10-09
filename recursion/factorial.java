package recursion;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. to find factorial  : ");
        int n= sc.nextInt();

        int f=1;

      int value= factorial(n,f);
        System.out.print("factorial : "+value);
    }
    static int factorial(int num,int fact) 
    {
        if(num==0)
        { return fact; }
      
        fact*=num;
        
        
        factorial(num-1,fact);
         System.out.println(fact); 
        return 1;
       
    }
}
