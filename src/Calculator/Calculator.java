package Calculator;

import java.util.Scanner;

public class Calculator {
    public Calculator() {
        Scanner input2 = new Scanner(System.in);

        System.out.println("Type the first value: ");
        double x = input2.nextInt();
        input2.nextLine();

        System.out.print("Enter an operation: ");
        String operation = input2.next();

        System.out.println("Type the second value: ");
        double y = input2.nextInt();

        double result = "+".equals(operation) ? x + y : 0;
        result = "-".equals(operation) ? x - y : result;
        result = "*".equals(operation) ? x * y : result;
        result = "/".equals(operation) ? x / y : result;
        result = "%".equals(operation) ? x % y : result;

        System.out.printf("%.2f %s %.2f = %.2f",
                x, operation, y, result);

        input2.close();

    }
}
