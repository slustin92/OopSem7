package save;


public interface Log {


    public void writeFile(String expression, String nameFile);
    public String getExpression(Double x, Double y, Double result, String operation);
}