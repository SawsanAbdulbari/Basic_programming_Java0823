import java.util.Scanner;

public class Array {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String []s = {"Actions speak louder than words.",
                "A barking dog never bites.",
                "A penny saved is a penny earned.",
                "All things come to those who wait."};


        System.out.print("Pick number from 1-4.\n");
        int choose = in.nextInt();

        if (choose >= 1 && choose <= 4)
        {
            System.out.println(s[choose - 1]);
        }
        else
        {
            System.out.println("Invalid input. Please enter a number between 1 and 4.");
        }


    }

}
