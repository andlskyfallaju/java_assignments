import javax.swing.*;
import java.util.Random;

public class ExtraSensoryGame {

    static String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
    static Random rand = new Random();

    public static void main(String[] args) {

        int correct = 0;

        for (int i = 0; i < 10; i++) {
            String selectedColor = getRandomColor();
            String guess = getUserGuess();

            showSelectedColor(selectedColor);

            if (isCorrectGuess(guess, selectedColor)) {
                correct++;
            }
        }

        showResults(correct);
    }

    // method to get random color
    static String getRandomColor() {
        int randomNumber = rand.nextInt(5);
        return colors[randomNumber];
    }

    // method to get user input
    static String getUserGuess() {
        return JOptionPane.showInputDialog(
                "Guess the color (Red, Green, Blue, Orange, Yellow):");
    }

    // method to display selected color
    static void showSelectedColor(String color) {
        JOptionPane.showMessageDialog(null,
                "The computer selected: " + color);
    }

    // method to check guess
    static boolean isCorrectGuess(String guess, String color) {
        return guess.equalsIgnoreCase(color);
    }

    // method to display results
    static void showResults(int correct) {
        JOptionPane.showMessageDialog(null,
                "You guessed correctly " + correct + " times out of 10.");
    }
}