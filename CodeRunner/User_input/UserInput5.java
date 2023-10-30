import java.util.Scanner;
public class UserInput5 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     int num1;
	     System.out.println("First number?");
	     num1 = in.nextInt();
	     int num2;
	     System.out.println("Second number?");
	     num2 = in.nextInt();

	     System.out.println(num1 + " + " + num2 + " = "+ (num1 + num2));
        
	}

}
