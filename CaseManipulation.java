package tutorial;


import java.util.Scanner;

public class CaseManipulation {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Please enter your name: ");

        
        String name = scanner.nextLine();

        
        scanner.close();

        System.out.println("Hello".toUpperCase() + "\n" + name.toLowerCase());
    }
}
