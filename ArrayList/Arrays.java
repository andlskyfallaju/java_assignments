import java.util.*;

public class Arrays {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many months are you entering rainfall measurements for?: ");
        int month = keyboard.nextInt();

        // Create array instead of ArrayList
        double[] rainfall = new double[month];

        for (int i = 0; i < month; i++) {
            System.out.print("Enter rainfall measurement " + (i + 1) + ": ");
            rainfall[i] = keyboard.nextDouble();
        }

        keyboard.close();

        // Display array values
        System.out.print("The entered numbers are: ");
        for (double r : rainfall) {
            System.out.print(r + " ");
        }
        System.out.println();

        double sum = totalRainfall(rainfall);
        System.out.println("Total Rainfall: " + sum);

        double avg = avgRainfall(rainfall);
        System.out.println("Average Rainfall: " + avg);

        double lowest = findLowestCustom(rainfall);
        System.out.println("Lowest Rainfall measurement: " + lowest);

        double highest = findHighestCustom(rainfall);
        System.out.println("Highest Rainfall measurement: " + highest);
    }

    public static double totalRainfall(double[] arr) {
        double sum = 0;
        for (double d : arr) {
            sum += d;
        }
        return sum;
    }

    public static double avgRainfall(double[] arr) {
        double sum = totalRainfall(arr);
        return sum / arr.length; // correct average
    }

    public static double findLowestCustom(double[] arr) {
        double min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double findHighestCustom(double[] arr) {
        double max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}