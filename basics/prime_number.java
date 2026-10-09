package basics;
import java.util.*;

public class prime_number{
    public static void main(String ars[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range : ");
        int n= sc.nextInt();

        for(int i=2;i<n;i++){
       if (prime_number(i)){
        System.out.print(i+" ");
       }
    }
}
    static boolean prime_number(int n){
        for(int j=2;j<n;j++){
            if(n%j==0){
                return false;
            }
          
        }
          return true;
    }
}