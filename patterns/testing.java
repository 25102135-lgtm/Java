package patterns;

import java.util.Scanner;
public class diamond {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the width of DIAMOND : ");
        int n =sc.nextInt();
        int c=0;
        int s=0;

        System.out.println();

        if(n%2==0)
        {
            System.out.println("INVALID INPUT !!");
        }

        else{
        // if(n%4==0)
        //     for(int i=1;i<=n/4;i++){
        //     System.out.print(" ");
        //     c=i;
        // }
        // else{
            for(int i=1;i<=(n/4)+1;i++){
                 System.out.print(" ");
                c=i;
        }
        
        for(int i=1;i<=n-2*c;i++){
            System.out.print(" *");
            s=i;
        }
        
        // if(n%4==0)
        //     for(int i=1;i<=n/4;i++){
        //     System.out.print("   ");
            
        // }
        //  else{
            for(int i=1;i<=(n/4)+1;i++){
            System.out.print(" ");
                
        }
    }

    System.out.println();

    for(int i=1;i<=c-1;i++){
        for(int j=1;j<=c-i;j++){
            System.out.print(" ");
            }
        for(int j=1;j<=1;j++){
            System.out.print("*");
            }
        // System.out.println();
        // }

        // for(int i=1;i<=c;i++){
            for(int j=1;j<=(2*s+2*i-2)+1;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=1;j++){
            System.out.print("*");
            }
            System.out.println();
            }
            // for(int i=1;i<=s-1;i++){
            //     for()

            // }
        }
    }

