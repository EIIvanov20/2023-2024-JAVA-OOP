package _3_27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            read();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        System.out.println(a/b);



        /*try{
            int a = Integer.parseInt(sc.nextLine());
            int b = Integer.parseInt(sc.nextLine());
            System.out.println(a/b);
        } catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }*/
        System.out.println("After try-catch");
    }

    public static void  read() throws FileNotFoundException {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/input.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}