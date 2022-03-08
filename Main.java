import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        
        Vector<Character> ye = Reader.readFromFile("prueba.txt");

        for (int i = 0; i < ye.size(); i++) {
            System.out.println(ye.get(i));
        }
    }
}
