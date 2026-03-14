import javax.swing.*;
import java.util.Random;

public class ExtraSensoryGame {
    public static void main(String[] args){
        String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
        Random rand = new Random();
        int correct = 0;

        for (int i = 0; i < 10; i++) {

            int randomNumber = rand.nextInt(5);
            String selectedColor = colors[randomNumber];

            String guess = JOptionPane.showInputDialog("Guess the color (Red, Green, Blue, Orange, Yellow):");

            JOptionPane.showMessageDialog(null, "The computer selected: " + selectedColor);

            if (guess.equals(selectedColor)) {
                correct++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "You guessed correctly " + correct + " times out of 10.");
    }
}
