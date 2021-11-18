import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter num1: ");
        double a = scanner.nextDouble();

        System.out.print("Enter num2: ");
        double b =scanner.nextDouble();


        System.out.print("Enter operator: ");
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = a + b; if (scanner.hasNext("=")) {
                System.out.println(a + " + " + b + " = " + result);
            }
                break;
            case '-':
                result = a - b;if (scanner.hasNext("=")) {
                System.out.println(a + "-" + b + " = " + result);
            }
                break;
            case '*':
                result = a * b;if (scanner.hasNext("=")) {
                System.out.println(a + "*" + b + " = " + result);
            }
                break;
            case '/':
                result = a / b;if (scanner.hasNext("=")) {
                System.out.println(a + " / " + b + " = " + result);
            }
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + operator);

        }



    }
}
