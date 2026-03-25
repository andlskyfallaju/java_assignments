class ArrayOperations {

    int getTotal(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return sum;
    }

    double getAverage(int[] arr) {
        return (double) getTotal(arr) / arr.length;
    }

    int getHighest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    int getLowest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }
}

public class ArrayApplication {
    public static void main(String[] args) {

        int[] data = {20, 30, 40, 55, 50, 15, 25, 35, 45, 5};

        ArrayOperations obj = new ArrayOperations();

        System.out.println("Total: " + obj.getTotal(data));
        System.out.println("Average: " + obj.getAverage(data));
        System.out.println("Highest: " + obj.getHighest(data));
        System.out.println("Lowest: " + obj.getLowest(data));
    }
}