import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Random randomNumber = new Random();

        while (true) {

            String playerInput = "";
            int computerNumber = randomNumber.nextInt(100);
            while (true) {

                System.out.print("Guess a number (1 - 100): ");
                playerInput = reader.nextLine();

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
                            System.out.println();
                            break;
                        } else if (playerNumber > computerNumber + 1) {
                            System.out.println("Too High");
                        } else {
                            System.out.println("Too Low");
                        }
                    }
                } else {
                    System.out.printf("[%s] is not a valid number! Try again!%n", playerInput);
                }
            }

            System.out.println("New game: press \"Y\" and after this press \"ENTER\" ");
            System.out.println("Exit game: press \"N\" and after this press \"ENTER\" ");
            System.out.print("Your choice is: ");

            playerInput = reader.nextLine();

            if (playerInput.equals("y") || playerInput.equals("Y")) {
                System.out.println();
                System.out.println();
                System.out.println("NEW GAME");
            } else if (playerInput.equals("n") || playerInput.equals("N")) {
                break;
            } else {
                System.out.println();
                System.out.printf("%s is invalid command! Expected command is \"Y\" or \"N\"%n", playerInput);
                break;
            }
        }

        System.out.println("good bye!");
    }
}
