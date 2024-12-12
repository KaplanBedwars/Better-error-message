package dev.kaplanbedwars.erormessage;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class ErrorLog {

    private static final String LOG_FILE = "error_log.txt";

    /**
     * Hata loglama işlemi.
     *
     * @param e Hata (Exception)
     * @param customMessage Kullanıcı tarafından belirlenmiş özel bir mesaj
     * @param severity Hata ciddiyet seviyesi (isteğe bağlı: LOW, MEDIUM, HIGH, CRITICAL)
     * @param language Loglama dili ("tr" veya "ing")
     * @param additionalData Ek bilgi (key-value çiftleri, isteğe bağlı)
     */
    public static void logError(Exception e, String customMessage, String severity, String language, String... additionalData) {
        StringBuilder logContent = new StringBuilder();

        // Zaman damgası ve başlık ekleme
        logContent.append(language.equals("tr") ? "==== HATA RAPORU ====" : "==== ERROR REPORT ====").append("\n");
        logContent.append(language.equals("tr") ? "// Sistem Hata Raporu" : "// System Error Report").append("\n");
        logContent.append(language.equals("tr") ? "Tarih: " : "Date: ").append(getCurrentTimestamp()).append("\n");
        logContent.append(language.equals("tr") ? "Ciddiyet: " : "Severity: ").append(severity != null ? severity : (language.equals("tr") ? "Bilinmiyor" : "Unknown")).append("\n");
        logContent.append(language.equals("tr") ? "Özel Mesaj: " : "Custom Message: ").append(customMessage).append("\n\n");

        // Hata bilgileri
        logContent.append(language.equals("tr") ? "==== HATA DETAYLARI ==== " : "==== ERROR DETAILS ====").append("\n");
        logContent.append(language.equals("tr") ? "Hata Türü: " : "Error Type: ").append(e.getClass().getName()).append("\n");
        logContent.append(language.equals("tr") ? "Hata Mesajı: " : "Error Message: ").append(e.getMessage() != null ? e.getMessage() : (language.equals("tr") ? "Mesaj Yok" : "No Message")).append("\n\n");

        // Ek bilgiler
        if (additionalData != null && additionalData.length > 0) {
            logContent.append(language.equals("tr") ? "==== EK BİLGİLER ==== " : "==== ADDITIONAL DATA ====").append("\n");
            for (int i = 0; i < additionalData.length; i += 2) {
                if (i + 1 < additionalData.length) {
                    logContent.append(additionalData[i]).append(": ").append(additionalData[i + 1]).append("\n");
                }
            }
            logContent.append("\n");
        }

        // Sistem bilgileri
        logContent.append(language.equals("tr") ? "==== SİSTEM BİLGİLERİ ==== " : "==== SYSTEM INFORMATION ====").append("\n");
        System.getProperties().forEach((key, value) -> logContent.append(key).append(": ").append(value).append("\n"));
        logContent.append("\n");

        // Çözüm önerileri
        logContent.append(language.equals("tr") ? "==== ÇÖZÜM ÖNERİLERİ ==== " : "==== SOLUTION SUGGESTIONS ====").append("\n");
        logContent.append(generateSolutionSuggestions(e, language));

        // Stack Trace bilgileri
        logContent.append(language.equals("tr") ? "==== YIĞIN İZLEME (STACK TRACE) ==== " : "==== STACK TRACE ====").append("\n");
        for (StackTraceElement element : e.getStackTrace()) {
            logContent.append("\tat ").append(element.toString()).append("\n");
        }
        logContent.append("\n========================\n");

        // Log dosyasına yazma işlemi (üzerine yazma)
        try (FileWriter writer = new FileWriter(LOG_FILE)) {
            writer.write(logContent.toString());
        } catch (IOException ioException) {
            System.err.println((language.equals("tr") ? "Log dosyasına yazılamadı: " : "Failed to write log file: ") + ioException.getMessage());
        }

        // Konsola yazdırma
        System.err.println(logContent.toString());
    }

    /**
     * Geçerli zaman damgasını alır.
     *
     * @return Şu anki zaman damgası
     */
    private static String getCurrentTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }

    /**
     * Dinamik çözüm önerileri oluşturur.
     *
     * @param e Hata (Exception)
     * @param language Dili ("tr" veya "ing")
     * @return Çözüm önerileri metni
     */
    private static String generateSolutionSuggestions(Exception e, String language) {
        StringBuilder suggestions = new StringBuilder();
        String errorType = e.getClass().getName();

        if (errorType.contains("NullPointerException")) {
            suggestions.append(language.equals("tr") ? "1. Null kontrolü yapın.\n" : "1. Check for null values.\n");
            suggestions.append(language.equals("tr") ? "2. İlgili nesnenin doğru şekilde başlatıldığından emin olun.\n" : "2. Ensure the object is properly initialized.\n");
        } else if (errorType.contains("ArithmeticException")) {
            suggestions.append(language.equals("tr") ? "1. Bölme işlemlerinde sıfır kontrolü yapın.\n" : "1. Check for division by zero.\n");
        } else {
            suggestions.append(language.equals("tr") ? "1. Hata mesajını inceleyerek kodunuzu kontrol edin.\n" : "1. Examine the error message and check your code.\n");
        }

        suggestions.append(language.equals("tr") ? "2. Daha fazla yardım için sistem yöneticinize veya geliştiriciye başvurun.\n" : "2. Contact your system administrator or developer for further assistance.\n");

        return suggestions.toString();
    }

    /**
     * Overloaded logError metodu, eski kullanım tarzını destekler.
     *
     * @param e Hata (Exception)
     * @param customMessage Kullanıcı tarafından belirlenmiş özel bir mesaj
     */
    public static void logError(Exception e, String customMessage) {
        logError(e, customMessage, null, "tr");
    }
}
