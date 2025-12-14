import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    public static String[] getShorterThanAverage(String[] array, double average) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < average) {
                result.add(array[i]);
            }
        }

        return result.toArray(new String[0]);
    }

    public static String[] getLongerThanAverage(String[] array, double average) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > average) {
                result.add(array[i]);
            }
        }

        return result.toArray(new String[0]);
    }
}
