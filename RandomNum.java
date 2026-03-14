import java.util.*;

public class RandomNum {
    public static void main(String[] args){
        int randomnum;
        int usernum;
        int count = 1;

        Random randomNumbers = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Lets play a guessing game. Enter a number between " +
                " 0 and 10: ");
        usernum = input.nextInt();

        randomnum = randomNumbers.nextInt(11);

        while (usernum != randomnum){
            if (usernum < randomnum){
                System.out.println("Too low. Guess again: ");
                usernum = input.nextInt();
            }else if(usernum > randomnum){
                System.out.println("Too high. Guess again: ");
                usernum = input.nextInt();
            }
            count ++;
        }
        System.out.println("You got it right");
        System.out.println("You guessed: " + count + " times");
    }
}
