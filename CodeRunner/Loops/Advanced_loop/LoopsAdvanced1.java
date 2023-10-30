import java.util.Scanner;

public class LoopsAdvanced1 {
    public static void main(String[] args) {


        int num1;
        int num2;

        Scanner in = new Scanner(System.in);

        System.out.println("First number?");
        num1 = in.nextInt();

        System.out.println("Last number?");
        num2 = in.nextInt();

        for ( int counter = num1; counter <= num2; counter++ )
        {
            System.out.println(counter);
        }
    }
}