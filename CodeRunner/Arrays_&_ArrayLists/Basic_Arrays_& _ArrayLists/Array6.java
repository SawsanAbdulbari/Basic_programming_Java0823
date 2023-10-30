import java.util.Scanner;

public class Array {

    public static void main(String[] args)
    {
        int[] nums = {16, 18, 5, 3, 10};

        int min =nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] < min)
            {
                min = nums[i];
            }
        }
        System.out.print(min);
    }

}
