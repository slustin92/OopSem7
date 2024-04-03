package reshenie;


public class Calculation implements Addition, Division, Multiplication {
public double summa;

    public double getSumma() {
        return summa;
    }

    @Override
    public double addition( double number1, double number2) {
        return summa = number1 + number2;

    }

    @Override
    public double division(double number1, double number2) {
        if (number1 == 0 || number2 == 0) {
            return summa = -1;
        } else {
            return summa = number1 / number2;
        }
    }

    @Override
    public double multiplication(double number1, double number2) {
        return summa = number1 * number2;
    }


}
