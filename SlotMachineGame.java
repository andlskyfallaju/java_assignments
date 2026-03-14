import javax.swing.*;
import java.util.Random;

public class SlotMachineGame {
    public static void main(String[] args) {

        Random rand = new Random();

        String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};

        double amountEntered = 0;
        double amountWon = 0;

        int playAgain = JOptionPane.YES_OPTION;

        while (playAgain == JOptionPane.YES_OPTION) {

            String input = JOptionPane.showInputDialog("Enter the amount of money to play:");
            double amount = Double.parseDouble(input);

            amountEntered += amount;

            String w1 = words[rand.nextInt(6)];
            String w2 = words[rand.nextInt(6)];
            String w3 = words[rand.nextInt(6)];

            JOptionPane.showMessageDialog(null,
                    w1 + " | " + w2 + " | " + w3);

            double winnings = 0;

            if (w1.equals(w2) && w2.equals(w3)) {
                winnings = amount * 3;
            }
            else if (w1.equals(w2) || w1.equals(w3) || w2.equals(w3)) {
                winnings = amount * 2;
            }

            amountWon += winnings;

            JOptionPane.showMessageDialog(null,
                    "You won: $" + winnings);

            playAgain = JOptionPane.showConfirmDialog(null,
                    "Do you want to play again?");
        }

        JOptionPane.showMessageDialog(null,
                "Total money entered: $" + amountEntered +
                        "\nTotal money won: $" + amountWon);
    }
}