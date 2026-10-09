package recursion;

import java.util.Scanner;

public class print_num_n_to_1 {

    static int number(int num)
    {
        if(num==1)
        return 1;
    // for upto 0 :
    //  if(num<1)
    // return 0;
       System.out.println(num);
       return number(num-1);

    }
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int n= sc.nextInt();
       System.out.println(number(n)); 

    }
    
}
