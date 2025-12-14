public class Main {

    public static void main(String[] args) {

        String[] input = {
                "Java",
                "programming",
                "is",
                "very",
                "interesting",
                "!"
        };

        double average = AverageCalculator.calculateAverageLength(input);

        System.out.println("Average string length: " + average);

        System.out.println("\nStrings shorter than average:");
        String[] shorter = StringUtils.getShorterThanAverage(input, average);
        for (String s : shorter) {
            System.out.println(s);
        }

        System.out.println("\nStrings longer than average:");
        String[] longer = StringUtils.getLongerThanAverage(input, average);
        for (String s : longer) {
            System.out.println(s);
        }
    }
}
