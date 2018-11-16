import java.text.*;
import java.util.Scanner;

public class SciCalculator {

    public static void main(String[] args){

        //declaration of variables and implementing scanner

        Scanner reader = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("#0.00");
        int x, NestLoop = 1, counter = 0;
        double a,b, result = 0.0,ActResult = 0.0;

        while(NestLoop != 0) {
            int loop =1;
            NestLoop++;
            System.out.println("\nCurrent Result: " + result);

            //printing menu
            System.out.println("\nCalculator Menu\n- - - - - - - - - - - - - - -\n0. Exit Program \n1. Addition \n2. Subtraction \n3. Multiplication " +
                    "\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average\n");
            while(loop != 0) { //loop in order so that user can have multiple options

                System.out.print("\nEnter Menu Selection:  ");

                //choosing calculation and printing final result
                x = reader.nextInt();

                //printing statements depending on user input
                if (x == 0) {

                    System.out.print("\nThanks for using this calculator. Goodbye!");
                    loop = 0;
                    NestLoop = 0;

                } else if (x == 1) {
                    System.out.print("Enter first operand: ");
                    a = reader.nextDouble();

                    System.out.print("Enter second operand: ");
                    b = reader.nextDouble();

                    result = a + b;
                    ActResult += result;
                    counter++;
                    loop = 0;

                } else if (x == 2) {
                    System.out.print("Enter first operand: ");
                    a = reader.nextDouble();

                    System.out.print("Enter second operand: ");
                    b = reader.nextDouble();

                    result = a - b;
                    ActResult += result;
                    counter++;
                    loop = 0;

                } else if (x == 3) {
                    System.out.print("Enter first operand: ");
                    a = reader.nextDouble();

                    System.out.print("Enter second operand: ");
                    b = reader.nextDouble();

                    result = a * b;
                    ActResult += result;
                    counter++;
                    loop = 0;

                } else if (x == 4) {
                    System.out.print("Enter first operand: ");
                    a = reader.nextDouble();

                    System.out.print("Enter second operand: ");
                    b = reader.nextDouble();

                    result = a / b;
                    ActResult += result;
                    counter++;
                    loop = 0;
                } else if (x == 5) {
                    System.out.print("Enter first operand: ");
                    a = reader.nextDouble();

                    System.out.print("Enter second operand: ");
                    b = reader.nextDouble();

                    result = Math.pow(a, b);
                    ActResult += result;
                    counter++;
                    loop = 0;

                } else if (x == 6) {
                    System.out.print("Enter first operand: ");
                    a = reader.nextDouble();

                    System.out.print("Enter second operand: ");
                    b = reader.nextDouble();

                    result = Math.log(b) / Math.log(a);
                    ActResult += result;
                    counter++;
                    loop = 0;


                } else if (x == 7) {
                    if (counter == 0) {
                        System.out.println("\nError: No calculations yet to average! ");


                    } else {
                        result = (ActResult / counter);
                        System.out.println("Sum of calculations: " + ActResult);
                        System.out.println("Number of calculations: " + counter);
                        System.out.printf("Average of calculations: " + f.format(result));
                    }

                } else {
                    System.out.println("\nError: Invalid selection!");

                }
            }
        }
    }
}
