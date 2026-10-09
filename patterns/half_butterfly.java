package patterns;

public class half_butterfly {
    public static void main(String[] args) {
        int j=1;
        for(int i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<=9-2*i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
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


    

