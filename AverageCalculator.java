public class AverageCalculator {

    public static double calculateAverageLength(String[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i].length();
        }

        return (double) sum / array.length;
    }
}
