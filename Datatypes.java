import java.util.Scanner;
public class Datatypes {
    public static void main(String[] args) {
    System.out.println("enter your name");
    Scanner sc=new Scanner(System.in);
    String name =sc.nextLine();
    System.out.println("Enter your age");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter your address");
    String address = sc.nextLine();
    System.out.println("Your name  is"+ name);
    System.out.println("your age is"+ age);
    System.out.print("Your address is"+ address);
sc.close();
    }  
}
