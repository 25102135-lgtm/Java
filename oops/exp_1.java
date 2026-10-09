package oops;

import java.util.Scanner;
public class exp_1 {
    public static void main(String[] args) {
        student s1 = new student();
        s1.getDetails();
        s1.display();
        
    }
}

class student {
    String Name;
    int roll_no;
    int cgpa;

    void getDetails(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your details :");
    System.out.println("Enter your Roll no : ");
    roll_no=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter your Name :");
    Name=sc.nextLine();
    System.out.println("Enter your cgpa : ");
    cgpa=sc.nextInt();
    }

    void display(){
    System.out.println("Roll no. :"+roll_no+""+"  Name : "+Name+" 134 cgpa : "+cgpa);
    }

}
