package d;

import dev.kaplanbedwars.erormessage.ErrorLog;

public class d {

    public static void main(String[] args)  {

          //ÖRNEK ÇÖKERTME KODU

        try {
            // Potansiyel hata oluşturabilecek kod
            int result = 10 / 0;  // Örnek hata
        } catch (Exception e) {
            // ErrorLog kullanımı
            ErrorLog.logError(e, "Olamaz!");
        }
    }
}

