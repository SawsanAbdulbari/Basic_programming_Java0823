
import java.util.Scanner;

public class Calculator02 
{

    public static void main(String[] args) 
    {
    	
        float num1 = readNumber("Enter the first number: ");
        float num2 = readNumber("Enter the second number: ");
        
        String operation = readOperation("Enter the operation type (+, -, *, /): ");

        float result = calculate(num1, num2, operation);
        printResult(result);
    }
    
    public static float readNumber(String message) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(message);
        return scanner.nextFloat();
    }
    
    public static String readOperation(String message) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(message);
        return scanner.next();
    }
    
    public static float addNumbers(float n1, float n2)
    {
        float result= n1 + n2;
        return result;
    }
    
    public static float subtractNumbers(float n1, float n2 )
    {
        float result= n1 - n2;
        return result;
    }
    
    public static float multiNumbers(float n1, float n2)
         {
        float result =  n1 * n2;
        return result;
    }
    
    public static float divideNumbers(float n1, float n2)
    {
        float result;
        if (n2 != 0)
        {
            result = n1 / n2;
            return result;
        }
        else
        {
            System.out.println("Error: Cannot divide by zero.");
            return Float.NaN;
        }
    }
    
    public static float calculate(float n1, float n2, String operation)
    {
        switch (operation)
        {
            case "+":
                return addNumbers(n1, n2);
            case "-":
                return subtractNumbers(n1, n2);
            case "*":
                return multiNumbers(n1, n2);
            case "/":
                return divideNumbers(n1, n2);
            default:
                System.out.println("Error: Invalid operation.");
                return Float.NaN;
        }
    }
    
    public static boolean isResultGreaterThan10(float result)
    {
        return result > 10 ? true : false;
    }
    
    public static void printResult(float result) 
    {
        if (isResultGreaterThan10(result))
            System.out.println("Result is greater than 10. Result is " + result);
        else
            System.out.println("Result is : " + result);
    }
}