package recursion;

import java.util.Scanner;

public class print_num_1_to_n {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number  : ");
        int n= sc.nextInt();
        int a=1;
      // cant write a void type function inside sout
      //   System.out.println(number(n,a)); 
      //have to call directly
      number(n,a);
    }
    static void number(int num,int i)
    {
        int number=num;
       if(i>number)
        return;
        System.out.println(i);
        number(number,i+1);
    }
}

// O R by:
//   static void number(int num)
//     { if(num<1)
//         return;
//         number(num-1);
//         System.out.println(num);
//     }




