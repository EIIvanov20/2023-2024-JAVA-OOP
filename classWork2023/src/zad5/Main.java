package zad5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pi = 3.14;
        double radius = scanner.nextInt();
        double height = scanner.nextInt();

        double vol = pi * radius * height;

        System.out.println(vol);
    }
}
