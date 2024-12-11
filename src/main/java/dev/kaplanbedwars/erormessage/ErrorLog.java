package dev.kaplanbedwars.erormessage;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ErrorLog {

    private static final String LOG_FILE = "error_log.txt";

    /**
     * Detaylı hata mesajı ve loglama
     *
     * @param e Hata (Exception)
     * @param customMessage Kullanıcı tarafından belirlenmiş özel bir mesaj
     */
    public static void logError(Exception e, String customMessage) {
        StringBuilder logContent = new StringBuilder();

        // Zaman damgası ekleme
        logContent.append("==== HATA RAPORU ====\n");
        logContent.append("// Olamaz, yine mi?\n");


        logContent.append("\n");

        logContent.append("Tarih: ").append(getCurrentTimestamp()).append("\n");
        logContent.append("Özel Mesaj: ").append(customMessage).append("\n\n");

        // Hata mesajı ve sebebi

        logContent.append("==== HATA ====\n");
        logContent.append("\n");
        logContent.append("Hata Türü: ").append(e.getClass().getName()).append("\n");
        logContent.append("Hata Mesajı: ").append(e.getMessage() != null ? e.getMessage() : "Mesaj Yok").append("\n\n");

        // Stack Trace ayrıntıları
        logContent.append("Yığın İzleme (Stack Trace):\n");
        for (StackTraceElement element : e.getStackTrace()) {
            logContent.append("\tat ").append(element.toString()).append("\n");
        }
        logContent.append("\n=====================\n");

        // Log dosyasına yazma
        try (FileWriter writer = new FileWriter(LOG_FILE, true)) {
            writer.write(logContent.toString());
        } catch (IOException ioException) {
            System.err.println("Log dosyasına yazılamadı: " + ioException.getMessage());
        }

        // Konsola yazdırma
        System.err.println(logContent.toString());
    }

    /**
     * Zaman damgasını alır.
     *
     * @return Geçerli zaman damgası
     */
    private static String getCurrentTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }
}
