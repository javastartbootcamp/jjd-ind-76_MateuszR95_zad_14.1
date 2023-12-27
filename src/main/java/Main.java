import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String fileName = "liczby.txt";
        try {
            Map<Integer, Integer> numbersMap = NumbersFileReader.fillMapFromFile(fileName);
            NumbersFileReader.printResult(numbersMap);
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku do odczytu");
        }
    }

}
