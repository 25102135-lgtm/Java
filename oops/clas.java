package oops;
public class clas{
    public static void main(String[] args) {
        System.out.println("your pen's length and colour : ");
        pen p1=new pen();
        p1.setcolor("blue");
        p1.setlenght(5);
        System.out.println("color : "+p1.color+", lenght :"+p1.lenght);
        p1.color="yellow";
        System.out.println(p1.color);
        
    }
}

class pen{
    int lenght;
    String color;


    void setcolor(String c){
        color=c;
    }
    void setlenght(int l){
        lenght=l;
    }
    
}

// class(pen) ke varibales(lenght,color) use krne ke lye object(p1) ki jarurat
// padegi like if you want to use variables of class in main 
// then it can done by p1.lenght or p1.color not individually as color or lenght