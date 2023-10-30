
import java.util.HashSet;
import java.util.Random;

public class LotteryCard
{

    public static void main(String[] args)
    {

        printTitle();
        printResult(lotteryCard());
    }
    public static int randomNumber(int from, int to) {
        Random rand = new Random();
        return rand.nextInt(to - from + 1) + from;
    }
    public static void printTitle()
    {
        System.out.println("\nLottery Card:");
        System.out.println("+------------------------+");
        System.out.println("|     Lottery Number     |");
        System.out.println("+------------------------+");
    }
    public static HashSet<Integer>  lotteryCard()
    {
        HashSet<Integer> lotteryNumbers = new HashSet<>();
        int randNums[] = new int[7];

        for(int i = 0; i < randNums.length; i++)
        {
            randNums[i] = randomNumber(1, 35);
            lotteryNumbers.add(randNums[i]);
        }

        return lotteryNumbers;
    }

    public static void printResult(HashSet<Integer> lotteryNumbers)
    {
        for (int num : lotteryNumbers)
        {
            System.out.printf("|       %6d           |%n", num);
        }
        System.out.println("+------------------------+");
    }

}