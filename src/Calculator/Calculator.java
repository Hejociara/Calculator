package Calculator;

import java.util.Scanner;

public class Calculator {
    public Calculator() {
        Scanner input2 = new Scanner(System.in);

        System.out.println("Type the first value: ");
        int x = input2.nextInt();
        input2.nextLine();
        System.out.println("Type the second value: ");
        int y = input2.nextInt();

        int addition = (x + y);
        System.out.println("addition: " + addition);
        int subtraccion = (x-y);
        System.out.println("addition: " + subtraccion);
        int multiplication = (x*y);
        System.out.println("multiplication: " + multiplication);
        int division = (x/y);
        System.out.println("division: " + division);

        input2.close();

    }
}
