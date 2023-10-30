import java.util.Random;
import java.util.Scanner;


public class Lucky7game00 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		int playerMoney;
        int gameRound = 0;

        System.out.print("Enter the amount of money to play with: \n");
        playerMoney = in.nextInt();

        while (playerMoney >= 1) 
        {
        	playerMoney--;
        	gameRound++;
        	
        	int []randNums = new int[3];
    		for(int i = 0; i< 3; i++)
    		{
    			randNums[i] = random.nextInt(10) + 1; 
    		} 
    		
    		
    		
    		System.out.println("Game " + gameRound + " The Numbers are : " +
                    randNums[0] + " " + randNums[1] + " " + randNums[2]);
    		

    		int numberOfSevens = 0;
            for (int num : randNums) 
            {
                if (num == 7) 
                {
                    numberOfSevens++;
                }
            }
    		
    		
    		
    		if (numberOfSevens == 3) 
            {
                System.out.println("Congratulations! You won €10.");
                playerMoney += 10;
            } 
            else if (numberOfSevens == 2) 
            {
                System.out.println("Congratulations! You won €5.");
                playerMoney += 5;
            } 
            else if (numberOfSevens == 1) 
            {
                System.out.println("Congratulations! You won €3.");
                playerMoney += 3;
            }
            else 
            {
                System.out.println("Sorry, you lost.");
            }
    		
    		System.out.println("Your balance is " + playerMoney + " Euro");
    		
    		if (playerMoney < 1)
    		{
    			System.out.println("\nYou have run out of money. Game over!");
    			break;
    		}
    		
    		System.out.print("Do you want to play again? (yes/no):\n ");
            String playAgain = in.next();
            
            if (!playAgain.equals("yes")) 
            {
            	System.out.println("\nThank you for playing, See you soon!");
                break;
            }
    		
    		
    		
        }
		
		
		
	}

}
