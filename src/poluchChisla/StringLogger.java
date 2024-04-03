package poluchChisla;

import java.io.FileWriter;
import java.io.IOException;

public class StringLogger {
    public void writeFile(String expression, String nameFile) {
        try (FileWriter fw = new FileWriter(nameFile, true)) {
            fw.write(expression + ";");
            fw.append('\n');
            fw.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
