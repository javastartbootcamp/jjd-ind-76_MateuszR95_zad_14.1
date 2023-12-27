import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class NumbersFileReader {

    public static Map<Integer, Integer> fillMapFromFile(String fileName) throws FileNotFoundException {

        Map<Integer, Integer> numbersMap = new TreeMap<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt()) {
                int numberInLine = scanner.nextInt();
                if (numbersMap.containsKey(numberInLine)) {
                    numbersMap.put(numberInLine, numbersMap.get(numberInLine) + 1);
                } else {
                    numbersMap.put(numberInLine, 1);
                }

            }
        }
        return numbersMap;
    }

    public static void printResult(Map<Integer, Integer> numbersMap) {
        Set<Map.Entry<Integer, Integer>> entries = numbersMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println(entry.getKey() + " - liczba wystąpień " + entry.getValue());
        }
    }
}
