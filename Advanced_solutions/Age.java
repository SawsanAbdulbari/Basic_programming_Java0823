import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
    	int age = readAge();
        ageGroups(age);

    }
    
    public static int readAge()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Enter your age: ");
        int age = scanner.nextInt();
        
        return age;
    }

      public static void printUnderAgeMassage(int age)
    {
        System.out.println("You are under age!");
        if (age >= 15)
            System.out.println("You can drive a scooter!");
        if (age >= 16)
            System.out.println("You can drive a motor cycle!");
    }
      
    public static void printMiddelAge(int age)
    {
        System.out.println("You are an adult!");
        if (age == 18)
            System.out.println("You are an adult and can drive a car now!");
        if (age >= 40 && age <= 50)
            System.out.println("Best middle age!");
        if ( age > 58 && age < 65)
            System.out.println("You can access early retirement!");

    }
    
    public static void printRetiredMassage(int age)
    {
        System.out.println("You are retired!");
        if (age == 65)
            System.out.println("Happy retirement!");
    }
    
    public static boolean isMilestoneAge(int age)
    {
        return age % 10 == 0 && age != 100 && age != 10;
    }
    
    public static void print100Age(int age)
    {
        System.out.println("Congratulations!\nYou are " + age + " Years old. \nYou have been living for a century.");
    }
    
    public static void ageGroups(int age)
    {
        if (age < 18)
            printUnderAgeMassage(age);

        else if (age >= 18 && age < 65)
            printMiddelAge(age);

        else if (age >= 65 && age != 100)
            printRetiredMassage(age);

        if (isMilestoneAge(age))
            System.out.println("Congratulations! You are now " + age + " years old" );

        if (age == 100)
            print100Age(age);
    }
}