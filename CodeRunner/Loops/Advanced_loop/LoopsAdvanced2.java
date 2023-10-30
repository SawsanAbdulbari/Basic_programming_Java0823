import java.util.Scanner;

public class LoopsAdvanced2 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

    	String name = "Emma";
        int numOfGuesses = 0;
        String userGuess;
        do{
            System.out.println("Guess my name (type stop to exit)");
            userGuess = in.nextLine();
            numOfGuesses++;

            if(userGuess.equalsIgnoreCase(name)){
                System.out.println("Congratulations!");
                break;
            }
            else if(userGuess.equalsIgnoreCase("stop"))
            {
                System.out.println("You guessed "+ (numOfGuesses-1) + " times.");
                break;
            }
        }while (true);


        if (!userGuess.equalsIgnoreCase("stop")) {
            System.out.println("You guessed " + numOfGuesses + " times.");
        }
    }
}