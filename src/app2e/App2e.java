package app2e;

import java.util.Scanner;


public class App2e {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int by;
        
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your birth year: ");
        by = sc.nextInt();
        
        System.out.println("Hello,"+name+" The Great Kupal"+", your age is "+(2025-by));
    }
    
}
