import java.util.Scanner;
public class UserInput4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int num1;
        System.out.println("First number?");
        num1 = in.nextInt();
        int num2;
        System.out.println("Second number?");
        num2 = in.nextInt();

        System.out.println("The sum is " + (num1 + num2) + ".");
        
	}

}
