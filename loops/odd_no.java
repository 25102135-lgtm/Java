package loops;
import java.util.Scanner;

public class odd_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num= sc.nextInt();

        int i=1;
        for(i=1;i<=num;i++)
        {if(i%2!=0)
        { System.out.println(i); }
        }
    }
}
