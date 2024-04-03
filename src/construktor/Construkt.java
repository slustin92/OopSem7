package construktor;

import poluchChisla.Scaner;

import poluchChisla.StringLogger;
import poluchChisla.Sumer;
import poluchChisla.Znak;
import reshenie.Calculation;
import save.Log;
import save.LogSave;

import java.io.IOException;
import java.util.Scanner;

public class Construkt implements Scaner {
    Sumer number = new Sumer() ;
    Znak znak = new Znak();
    Calculation calcul = new Calculation();

    public Construkt() throws IOException {
    }

    @Override
    public void scaner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Первое число: ");
        double a = sc.nextInt();

        number.setNumber(a);
        System.out.println("Действие: ");
        String z = sc.next();

        znak.setZnak(z);
        System.out.println("Второе число: ");
        double b = sc.nextInt();

        number.setNumber(b);
        sc.close();
    }
    public double calculeit(){
        Log log = new LogSave();
        String txt = "";
        if (znak.getZnak().equals("+")){
            txt = log.getExpression(number.getNumber().getFirst(), number.getNumber().getLast(), calcul.addition(number.getNumber().getFirst(), number.getNumber().getLast()), znak.getZnak());
            log.writeFile(txt, "src\\Save.txt");
            return calcul.addition(number.getNumber().getFirst(), number.getNumber().getLast());
        }
        if (znak.getZnak().equals("/")){
            txt = log.getExpression(number.getNumber().getFirst(), number.getNumber().getLast(), calcul.division(number.getNumber().getFirst(), number.getNumber().getLast()), znak.getZnak());
            log.writeFile(txt, "src\\Save.txt");
                return calcul.division(number.getNumber().getFirst(), number.getNumber().getLast());


        }
        if (znak.getZnak().equals("*")){
            txt = log.getExpression(number.getNumber().getFirst(), number.getNumber().getLast(), calcul.multiplication(number.getNumber().getFirst(), number.getNumber().getLast()), znak.getZnak());
            log.writeFile(txt, "src\\Save.txt");
            return calcul.multiplication(number.getNumber().getFirst(), number.getNumber().getLast());
        }
//        log.writeFile(txt, "Logging\\Save.txt");
        return 0;
    }



    @Override
    public String toString() {
        return "Construkt{" +
                "number=" + number +
                "znak= " + znak +
                "calculeit= " + calcul.getSumma() +
                '}';
    }
}
