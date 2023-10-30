import java.util.Scanner;
public class UserInput1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String name;
        System.out.println("What is your name?");
        name = in.nextLine();
        System.out.println("Your name is " + name + ".");
	}

}
