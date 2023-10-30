import java.util.ArrayList;
import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        int heitetytNoppaluvut[] = {1,2,3,4,5,6};

        int sum = 0;
        for(int i = 0; i < heitetytNoppaluvut.length; i++)
        {
           System.out.println(heitetytNoppaluvut[i]);
            sum += heitetytNoppaluvut[i];
        }
        System.out.println("\nThe Sum of all array numbers is : "+sum);

        int max = heitetytNoppaluvut[0];
        for(int i = 0; i < heitetytNoppaluvut.length; i++)
        {
            if (heitetytNoppaluvut[i] > max)
            {
                max = heitetytNoppaluvut[i];
            }
        }
        System.out.println("\nThe Max of all array numbers is : " + max);



    }
}
