package oops;

public class frac {
    public static class fraction{
        int num;
        int den;

        fraction(int num, int den){
            this.num=num;
            this.den=den;
            System.out.println("original f1 fraction  : "+num+"/"+den);
            simplify();
            // System.out.println(this.num+"/"+this.den);
        }
        fraction(){

        }

        void print(){
            System.out.println("original : "+this.num+"/"+this.den);
        }
        void add(fraction f){
            this.num=this.num*f.den + this.den*f.num;
            this.den=this.den*f.den;
            simplify();
            
        }

        void simplify(){
           int a=this.num;
           int b=this.den;
           while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
           }
           this.num=num/a;
           this.den=den/a;
           System.out.println(" fraction : "+this.num+"/"+this.den);
        }

    }
    public static void main(String args[]){
        fraction f1 = new fraction(5,10);
        fraction f2 = new fraction();
        f2.num=10;
        f2.den=5;
        f2.print();
        f2.simplify();
        // f2.print();
        f2.add(f1);
        System.out.println("addition : "+f2.num+"/"+f2.den);
    }
}
    

