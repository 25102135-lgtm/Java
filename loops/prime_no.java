package loops;
import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num =sc.nextInt();
        System.out.println("Prime numbers are : ");

        int i;
        for(i=1;i<=num;i++)
        {
            int j=1;
            int count=0;
           while(j<=i)
           {
            if(i%j==0)
            {
                count=count+1;
            }
             j++;
           }
            if(count==2)
            {
                System.out.println(i);
            }
           
            
        }
    }
}