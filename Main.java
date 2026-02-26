import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        System.out.print("Представтесь: ");
        final var name = scanner.nextLine();
        System.out.println("Привет, %s%n", name);
    }
}