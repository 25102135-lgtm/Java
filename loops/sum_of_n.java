package loops;
import java.util.Scanner;

public class sum_of_n {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num =sc.nextInt();
    int i=num;
    int sum=0;
    while(i>=1)
    {
        sum=sum+i;
        i--;
    }
    System.out.println("Sum of first "+num+" numbers is : "+sum);
    }
    
}
