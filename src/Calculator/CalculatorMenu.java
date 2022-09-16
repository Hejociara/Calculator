package Calculator;

import java.util.Scanner;

/**
 * @author : Hejociara do Vale
 * Date: 24/01/2022
 *Since: 1.0
 */
public class CalculatorMenu {
    public static void main(String[] args) {
           Scanner menu = new Scanner(System.in);

            System.out.println("         Welcome to calculator       ");
            System.out.println("Please, insert an option: ");
            System.out.println("1 - Standard calculator");
            System.out.println("2 - IMC calculator");
            System.out.println("3 - Area calculator ");
            System.out.println("4 - Exit");

            var option = menu.nextInt();

            switch (option) {
                case 1:
                    System.out.print("\nStandard calculator");
                    break;

                case 2:
                    System.out.print("\nIMC calculator\n");
                    break;

                case 3:
                    System.out.print("\nArea calculator\n");
                    break;

                default:
                    System.out.print("\nInvalid Option!");
                    break;

                case 4:
                    System.out.print("\nSee you soon!");
                    menu.close();
            }
        }
    }

