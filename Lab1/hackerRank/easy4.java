import java.util.Scanner;

public class InputOutputII {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        scanner.nextLine();
        String c = scanner.nextLine();
        scanner.close();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
