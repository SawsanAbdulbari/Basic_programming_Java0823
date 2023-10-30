import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Method {
    public static void main(String[] args)
    {
        printMethod();
        System.out.println( "Your number * 1000 is " + multi1000(readNumber()));
        int w = readPositiveNumber("Enter the width : ");
        int l = readPositiveNumber("Enter the lenght");
        System.out.print("Area is " + w + " * " + l + " = " );
        System.out.println(calculateArea(w,l));

        if (calculateArea(w,l) > 50)
        {
            System.out.print("What a big room! \n");
        }
        sortTableArray();
        wordsTable();
    }
    public static void wordsTable()
    {
        ArrayList<String> wordsTable = new ArrayList<>();
        wordsTable.add("Laura");
        wordsTable.add("Sara");
        wordsTable.add("Tapio");
        wordsTable.add("Pauli");
        printTableSorted(wordsTable);

    }
    public static void printTableSorted(ArrayList<String> table)
    {
        Collections.sort(table);

        System.out.println("\nHERE IS THE ARRAYLIST: ");
        for (String word : table)
        {
            System.out.println(word);
        }
    }
    public static void sortTableArray()
    {
        String[] arr = {"Sawsan","Linda", "Tommi", "Kayan" };
        printTableSorted(arr);
    }
    public static void printTableSorted(String[] array)
    {
        Arrays.sort(array);
        System.out.println("\nHERE IS THE ARRAY: ");
        for (String s : array)
        {
            System.out.println(s);
        }
    }

    public static int calculateArea(int wigth, int linght)
    {
        return wigth * linght;
    }
    public static int readPositiveNumber(String message)
    {
        int number;
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println(message);
            number = scanner.nextInt();
        } while (number <= 0);

        return number;
    }
    public static int readNumber()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return scanner.nextInt();
    }
    public static int multi1000(int num)
    {
        return num * 1000;
    }
    public static void printMethod()
    {
        System.out.println("Metodi-harjoituksia");
    }
}
