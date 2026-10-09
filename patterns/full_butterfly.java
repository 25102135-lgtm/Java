package patterns;

public class full_butterfly {
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=9-2*i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==5){
                    System.out.print("");
                }
                else{
                System.out.print("*");
            }
        }
            System.out.println();
        }
    for(int i=1;i<=4;i++){
        for(int j=1;j<=4-(i-1);j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*i-3+2;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=4-(i-1);j++){
            if(j==5){
                System.out.print("");
            }
            else{
                System.out.print("*");
            }

        }
        System.out.println();
    }

    }
}