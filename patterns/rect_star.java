package patterns;
import java.util.Scanner;

public class rect_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Rectangle : ");
        int l=sc.nextInt();
        System.out.print("Enter the breadth of Rectangle : ");
        int b = sc.nextInt();
        if(b==l){
            System.out.println(" !! Rectangle cannot be created");
            return;
        }
        rect(l,b);
    }
    static void rect(int l,int b){
        for(int i =1;i<=l;i++){
            for(int j=1;j<=b;j++){
                if(i==1 || i==l || j==1||j==b){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
    }
}
