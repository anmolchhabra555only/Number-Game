import java.util.Random;
import java.util.Scanner;

    public class Task_01_Number_Game {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                Random random = new Random();

                int RandomNumber = random.nextInt(100) + 1;
                int number_of_trial = 0;
                int UserNumber;

                System.out.println("Welcome to the Number Game!");

                do {
                    System.out.print("Enter your guess\n ");
                    UserNumber = scanner.nextInt();
                    number_of_trial++;

                    if (UserNumber < RandomNumber) {
                        System.out.println("Too low! Try again.\n");
                    } else if (UserNumber > RandomNumber) {
                        System.out.println("Too high! Try again.\n");
                    } else {
                        System.out.println("Congratulations! You guessed the number in " + number_of_trial + " attempts.");
                    }
                } while (UserNumber != RandomNumber);

                scanner.close();
            }
        }
