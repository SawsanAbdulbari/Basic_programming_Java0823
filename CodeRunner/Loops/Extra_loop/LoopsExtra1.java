import java.util.Scanner;

public class LoopsExtra1 {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

        System.out.println("How many rows?");
        int rows = in.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print("*" );
            }
            System.out.println();
        }
    }
}