import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secretNumber = random.nextInt(100) + 1;

        int attempts = 0;

        while(true) {
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            attempts++;


            if ( number < secretNumber){
                System.out.println("Too low, try a higher number");
            }else if( number > secretNumber){
                System.out.println("Too high, try a lower number");
            }else{
                System.out.println("Correct! You found it in " + attempts + " attempts.");
                break;
            }
        }

    }
}