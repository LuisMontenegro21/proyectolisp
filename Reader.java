
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class Reader {
    public static Vector<Character> readFromFile(String path) {
        Vector<Character> vector = new Vector<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = reader.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    vector.add(c);
                }
            }
            reader.close();
            return vector;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}