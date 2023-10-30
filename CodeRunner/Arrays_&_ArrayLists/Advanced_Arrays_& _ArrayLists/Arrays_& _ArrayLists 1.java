import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float javelinThrows[] = new float[3];

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Throw length" );
            javelinThrows[i] = scanner.nextFloat();
        }

        for(int i = 0; i < 3; i++)
        {
            System.out.printf("Throw " + (i + 1) + ": " + javelinThrows[i] + "\n");
        }

    }


}