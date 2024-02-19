import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //create variables
        double value1, value2, result;
        String operation;

        System.out.print("Please select a Operation: ");
        operation = input.next();
        System.out.print("Please enter value 1: ");
        value1 = input.nextDouble();
        System.out.print("Please enter value 2: ");
        value2 = input.nextDouble();

        //calculation
        switch (operation){
            case "+":
                result = value1 + value2;
                System.out.println(result);
                break;
            case "-":
                result = value1 - value2;
                System.out.println(result);
                break;
            case "/":
                result = value1 / value2;
                System.out.println(result);
                break;
            case "*":
                result = value1 * value2;
                System.out.println(result);
                break;
            default:
                System.out.println("Invalid Operation!");

        }
    }
}