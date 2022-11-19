import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        diolog(number);
    }

    public static void diolog(int a) {
        if (a == 1) {
            System.out.println("Hi");
        } else {
            System.out.println("Bye");

        }
    }

}