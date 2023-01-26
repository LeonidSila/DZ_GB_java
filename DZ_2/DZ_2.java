package DZ_2;

import java.util.Scanner;
import java.util.logging.Logger;

public class DZ_2 {
    static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public class Customer {
        static Logger logger = Logger.getLogger(String.valueOf(Customer.class));

        public static void main(String[] args) {
            System.out.println("Final Output");
        }
    }


    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();

    }
    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;

            default:
                System.out.println("Введите оператор: -, +, *, /");
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int num1 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите второе число: ");
        int num2 = scanNumber();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);

    }

    private static class SampleClass {
    }
}