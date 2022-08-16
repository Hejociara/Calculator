package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void Calculator(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y;

        System.out.println("Type the first value: ");
        x = scan.nextInt();
        System.out.println("Type the second value: ");
        y = scan.nextInt();

        int addition = addition (x,y);
        System.out.println("addition: " + addition);
        int subtraction = subtraction (x,y);
        System.out.println("sub: " + subtraction);
         int multiplication = multiplication (x,y);
        System.out.println("mult: " + multiplication);
         int division = division (x,y);
        System.out.println("division: " + subtraction);

    }
    public static int addition (int x, int y){
        return x + y;
    }
    public static int subtraction (int x, int y){
        return x - y;
    }
    public static int multiplication (int x, int y){
        return x * y;
    }
    public static int division (int x, int y){
        return x / y;
    }
}
