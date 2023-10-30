import java.util.Scanner;
public class UserInput2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String name;

        System.out.println("What is your name?");
        name = in.nextLine();

        if (name.isEmpty()) {
            System.out.println("Error");
        }
        else
        {
            System.out.println("Your name is " + name + ".");
        }
	}

}
