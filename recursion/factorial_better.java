package recursion;

import java.util.*;
public class factorial_better {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Factorial : "+factorial(num));
        
    }
    static int factorial(int n)
    {
        if(n==0)
        return 1;
        
        return n*factorial(n-1);
    }
}
