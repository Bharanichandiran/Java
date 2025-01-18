import java .util.Scanner;
public class Loop {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.err.println("Enter the color");
String clr=sc.nextLine();
if (clr.equals("red")) {
    System.out.println("stop");
} else if (clr.equals("green")) {
    System.out.println("go");
} else {
    System.out.println("wait");
}
    }}