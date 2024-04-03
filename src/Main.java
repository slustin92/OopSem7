import construktor.Construkt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.logging.*;



public class Main {
    private static File log;
    private static FileWriter fileWriter;
//    private static Logger logger = Logger.getLogger(Main.class.getName());



    public static void main(String[] args) throws IOException {

        Construkt construkt = new Construkt();
        construkt.scaner();
        construkt.calculeit();

        System.out.println(construkt);






    }

}