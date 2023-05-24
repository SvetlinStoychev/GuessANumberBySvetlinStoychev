import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Random randomNumber = new Random();

        int computerNumber = randomNumber.nextInt(100);

        while (true) {
            System.out.print("Guess a number (1 - 100): ");
            String playerInput = reader.nextLine();

            boolean isValidNumber = true;

            for (int i = 0; i < playerInput.length(); i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                    isValidNumber = false;
                }
            }

            if (isValidNumber) {
                int playerNumber = Integer.parseInt(playerInput);

                if (playerNumber < 1 || playerNumber > 100) {
                    System.out.printf("Number [%d] is out of range! Try again!%n", playerNumber);
                } else {

                    if (playerNumber == computerNumber + 1) {
                        System.out.println("you guessed it!");
                        break;
                    } else if (playerNumber > computerNumber) {
                        System.out.println("Too High");
                    } else {
                        System.out.println("Too Low");
                    }
                }
            } else {
                System.out.printf("[%s] is not a valid number! Try again!%n", playerInput);
            }
        }
    }
}