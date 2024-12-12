package d;

import dev.kaplanbedwars.erormessage.ErrorLog;

import java.util.HashMap;
import java.util.Map;

public class d {

    public static void main(String[] args)  {

          //ÖRNEK ÇÖKERTME KODU

        try {
            int[] array = new int[5];
            int value = array[10]; // ArrayIndexOutOfBoundsException oluşturur
        } catch (Exception e) {
            ErrorLog.logError(
                    e,
                    "Array index out of bounds.",
                    "HIGH",
                    "tr",
                    "Operation", "Accessing array",
                    "Index", "10"
            );
        }


    }
}

