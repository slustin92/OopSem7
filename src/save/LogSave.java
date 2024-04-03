package save;



import java.io.IOException;
import java.io.FileWriter;

public class LogSave implements Log {

    @Override
    public String getExpression(Double x, Double y, Double result, String operation) {
        String op = "";
        if (operation.equals("+"))
            op = " + ";

        else if (operation.equals("*"))
            op = " * ";
        else if (operation.equals("/"))
            op = " / ";
       
        return String.format("%s%s%s = %s", x, op, y, result);
    }

    @Override
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
