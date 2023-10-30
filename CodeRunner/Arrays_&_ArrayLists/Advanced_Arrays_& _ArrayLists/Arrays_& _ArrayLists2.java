import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        while (true) {
            System.out.println("Add item (x = exit) ");
            String item = scanner.nextLine();

            if (item.equals("x"))
            {
                break;
            } else
            {
                shoppingList.add(item);
            }
        }

        for (String item : shoppingList)
        {
            System.out.println(item);
        }

    }
}