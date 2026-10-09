package basics;
import java.util.Scanner;

public class Q3_uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter lower case : ");
        char lower =sc.next().charAt(0);

        char upper= Character.toUpperCase(lower);
        System.out.print("Upper_case :" +((upper)));

        


        
    }
}
