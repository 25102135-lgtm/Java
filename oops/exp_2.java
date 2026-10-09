package oops;

public class exp_2 {
    String name;
    int id;
    double salary;

    exp_2(){
        System.out.println("name"+name);
     }
    exp_2(int i, String n){
        name=n;
        id=i;
        System.out.println("name : "+name+" id : "+id);
    }
    exp_2(int i, String n, double s){
        id=i;
        name=n;
        salary=s;
           System.out.println("name : "+name+" id : "+id+" salary : "+salary);
    }
    public static void main(String[] args) {
        
        exp_2 e1=new exp_2();
          exp_2 e2=new exp_2(34,"sukh");
            exp_2 e3=new exp_2(35,"khushi", 55.5);
    }
}
    

