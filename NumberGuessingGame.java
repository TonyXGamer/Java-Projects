import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int tries = 0;

        //gives random number from 1 to 99
        int randNum = rand.nextInt(100) + 1;

        while(tries < 10){

            //Ask the user to enter a number to guess
            System.out.print("Guess the number: ");
            int numGuess = input.nextInt();

            if(numGuess > randNum){
                System.out.println("Too High!");
                ++tries;
            }else if(numGuess < randNum){
                System.out.println("Too Low!");
                ++tries;
            }else if(randNum == numGuess){
                System.out.println("You Got It!");
                System.exit(0);
            }
        }
        System.out.println("Out Of Tries :(");
    }
}