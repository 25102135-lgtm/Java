public class inheritance {
    public static class human{
        int hands;
        int legs;
    }
    public static class man extends human{
        int chest;
         void print(){
            System.out.println(this.hands+" "+this.chest);
        }
    }
    public static class woman extends human{
        int breast;
    }
    public static void main(String[] args) {
        man m1 = new man();
        m1.hands=2;
        m1.chest=56;
        m1.print();
    }
    
}
