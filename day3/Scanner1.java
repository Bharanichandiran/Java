package day3;
import java.util.Scanner;


public class Scanner1 {
    public static void main(String[] args){
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a line of tex
System.out.println("your name is "+ name);
    }
}
