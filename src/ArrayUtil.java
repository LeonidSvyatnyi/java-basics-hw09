import java.util.*;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        List<String> arrayList = Arrays.asList(array2);
        Set<String> result = new HashSet<>();
        for (String s : array1) {
            if (arrayList.contains(s)) {
                result.add(s);
            }
        }

        return result.toArray(new String[0]);
    }
}