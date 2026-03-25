import java.util.Random;
import java.util.Scanner;

class LotteryApp {

    int[] lotteryNumbers = new int[5];

    // Generates random numbers (0–9)
    LotteryApp() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            lotteryNumbers[i] = rand.nextInt(10);
        }
    }

    // compare arrays and returns matching elements
    int compare(int[] userNumbers) {
        int matches = 0;
        for (int i = 0; i < 5; i++) {
            if (lotteryNumbers[i] == userNumbers[i]) {
                matches++;
            }
        }
        return matches;
    }

    void displayLottery() {
        System.out.print("Lottery numbers: ");
        for (int num : lotteryNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public class LotteryApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] userNumbers = new int[5];

        System.out.println("Enter 5 numbers (0–9) separated by spaces:");
        for (int i = 0; i < 5; i++) {
            userNumbers[i] = sc.nextInt();
        }

        LotteryApp lottery = new LotteryApp();
        lottery.displayLottery();

        int matches = lottery.compare(userNumbers);
        System.out.println("Matching digits: " + matches);

        if (matches == 5) {
            System.out.println("Grand Prize Winner!");
        }
    }
}