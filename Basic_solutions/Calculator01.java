import java.util.Scanner;

public class Calculator01 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float num1 = in.nextFloat();  

        System.out.println("Enter the second number: ");
        float num2 = in.nextFloat();  

        System.out.println("Enter operation (+, -, *, /): ");
        String operationType = in.next();  

        float result = 0;

        switch (operationType) {
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        System.out.println("Result: " + result);
    }
}