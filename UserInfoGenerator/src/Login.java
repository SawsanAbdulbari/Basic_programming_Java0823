// Importing libraries and packages.
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Ask user to input first name, last name and company domain.
        String fName = readUserName("Enter your first name: ", scanner,10);
        String lName = readUserName("Enter your last name: ", scanner, 10);
        String dName = readCompanyDomain(scanner);
        // Close the scanner
        scanner.close();

        // Convert special characters
        fName = convertSpecialCharacters(fName);
        lName = convertSpecialCharacters(lName);
        dName = convertSpecialCharacters(dName);

        // Validate user input
        String validationMessage = validateInput(fName, lName, dName);
        if (!validationMessage.isEmpty())
            printErrorMessage(validationMessage);
        else
            // Generate user information and print it.
            generateUserInfo(fName, lName, dName);
    }
    // Define an enumeration for text colors.
    public enum enColor {RED, GREEN, YELLOW}

    public static void printColored(String message, enColor color)
    {   // Define ANSI escape codes for text color, for more information open the following link : https://rb.gy/w2auq

        String colorCode = switch (color)
        {
            case RED -> "\u001B[31m"; // Red
            case GREEN -> "\u001B[32m"; // Green
            case YELLOW -> "\u001B[33m"; // Yellow
        };
        // Print the message in specified color.
        System.out.print(colorCode + message);
    }
    public static void generateUserInfo(String fName, String lName, String dName)
    {
        // Generate the email address based on user input.
        String email = generateEmail(fName, lName, dName);

        // Extract the first four characters of the first name.
        String subFname = subFirstName(fName);

        // Extract the last four characters of the last name.
        String subLname = subLastName(lName);

        // Generate the username by concatenating subFname and subLname.
        String userName = generateUserName(subFname, subLname);

        // Print the generated email address in green color text.
       printColored("Generated email is: " + email , enColor.GREEN);

       // Print a newline for separation.
       System.out.println();

        // Print the generated username in yellow color text.
       printColored("Generated user name is: " + userName , enColor.YELLOW);
    }
    public static String convertSpecialCharacters(String userInput)
    {
        //Define a map for special character replacements
        Map<String, String> specialCharactersMap = new HashMap<>();
        specialCharactersMap.put("ä", "a");
        specialCharactersMap.put("ö", "o");
        specialCharactersMap.put("å", "o");

        // Iterate through the map and replace special characters
        for (Map.Entry<String, String> entry : specialCharactersMap.entrySet())
        {
            userInput = userInput.replaceAll(entry.getKey(), entry.getValue());
        }
        return userInput;
    }
    public static void printErrorMessage(String errorMessage)
    {
        System.out.print("\u0007"); // Bell sound
        printColored(errorMessage, enColor.RED);
    }
    public static String validateInput(String fName, String lName, String dName)
    {
        /*
        *´StringBuilder´ used to build the error message.
        *  It concatenates error message if multiple errors are found.
        * This method calls ´isNullOrEmpty´ for each input.
        * If true it appends the error message to the ´errorMessage´ ´StringBuilder´.
         */
        StringBuilder errorMessage = new StringBuilder();

        if (isNullOrEmpty(fName)) errorMessage.append("First Name is missing! " + "Try again.");
        if (isNullOrEmpty(lName)) errorMessage.append("Last Name is missing! " + "Try again.");
        if (isNullOrEmpty(dName)) errorMessage.append("Company Domain is missing! " + "Try again.");
        // Trim and return the error message string
        return errorMessage.toString().trim();
    }
    public static boolean isNullOrEmpty(String str)
    {
        //This Method checks if the input string is null or has no characters.
        return str == null || str.isEmpty();
    }
    public static String generateUserName(String name1, String name2)
    { // This method concatenated sub first name with sub last name to generate username.
        return name1 + name2;
    }
    public static String subLastName(String name2)
    {   /* This method extracts the last 4 characters of the string given name (Last name)
           if it has at least 4 chars or the entire name if it has fewer than 4 chars.
           @parameter name2 the original (given) last name.
           Basically it affectively shortens the last name to a max of 4 characters or return the full last name if it's shorter.
        */
        return name2.substring(Math.max(0, name2.length() - 4));
    }
    public static String subFirstName(String name1)
    {
        // This method does the same as subLastName method but first 4 characters.
        // For more information look to the subLastName comments.
        return name1.substring(0, Math.min(name1.length(), 4));
    }
    static String generateEmail(String name1, String name2, String name3)
    {
        // The Method generates an Email by combining the user's input strings (user FirstName, LastName and company domain).
        // It returns a formatted email address string in the form "firstName.lastName@companyDomain".
        return name1 + "." + name2 + '@' + name3;
    }
    public static String readCompanyDomain(Scanner scanner)
    {
        /*This Method reads and validate the user's company domain input with a maximum length constraint.
          @ parameter message : The message displayed to the user and ask to input specifics value.
          @ parameter Scanner : It's an object used for the input.
          @ return A validated and formatted company domain string.
        */
        String dName;
        do {
            // Ask the user to enter the company with a maximum length constraint of 30 characters.
            dName = readUserName("Enter your company domain (e.g., example.com): ", scanner, 30);
        } while (!isValidCompanyDomain(dName)); // Continue looping till a valid domain is provided.
        // Convert the user input to lower case and trim any whitespace from the beginning or the trailing of the string.
        return dName.toLowerCase().trim();
    }
    public static boolean isValidCompanyDomain(String dName) {
        // Validate that the company domain contains a dot and has characters before and after the dot.
        return dName.matches("^.+\\..+$");
    }
    public static String readUserName(String message, Scanner scanner, int maxChars)
    {   /*This Method reads user input with a maximum length constraint.
          @ parameter message : The message displayed to the user and ask to input specifics value.
          @ parameter Scanner : It's an object used for the input.
          @ return the user's input as a string
        */
        System.out.print(message);
        String userName = scanner.nextLine();

        if (userName.length() > maxChars)
        {
            System.out.println("The length of your input is too long, it will be cut to the maximum length of " + maxChars + ".");
            userName = userName.substring(0, maxChars); // Cut the length of the name to the ´maxChar´.
        }
        // Convert the user input to lower case and trim any whitespace from the beginning or the trailing of the string.
        return userName.toLowerCase().trim();
    }
}