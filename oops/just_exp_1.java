package oops;

import java.util.Scanner;

public class just_exp_1 {
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
     public static void main(String[] args) {
        just_exp_1 s1 = new just_exp_1();
        s1.getDetails();
        s1.display(); }
}
