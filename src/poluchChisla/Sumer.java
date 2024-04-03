package poluchChisla;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sumer {
    public List<Double> number = new ArrayList<>();

    public List<Double> getNumber() {
        return number;
    }

    public void setNumber(double number) {

        this.number.add(number);
    }


    @Override
    public String toString() {
        return "Sumer{" +
                "number=" + number +
                '}';
    }
}
