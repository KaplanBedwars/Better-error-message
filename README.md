## Nedir?
[(for the english version)](https://github.com/KaplanBedwars/Better-error-message/blob/main/README2.MD)
Sıkıcı hata mesajlarından sıkıldınızmı?
Bu kolay ve basit kod tüm mesajı görüntüler.

## Yükleme 

Bu kod'u kurmak ve kullanmak çok basittir. İşte bazı örnekler:

## Çökme

 Örnek kod aşşağıdaki gibidir.

```java
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


  
```
    
## Nasıl eklenir

Bu Class'ı eklemek çok basittir! İlk önce **dev.kaplanbedwars.erormessage**'ı  [(İndirmek için)](https://github.com/KaplanBedwars/Better-error-message/tree/main/src/main/java)  indirin ardından src klasörünüze atın.


Kodunuzu açın ve şunu ekleyin:

```java
  import dev.kaplanbedwars.erormessage.ErrorLog;
```

Hata mesajını yansıtmak için:

```java
  try {
            // Potansiyel hata oluşturabilecek kod
            int result = 10 / 0;  // Örnek hata
        } catch (Exception e) {
            // ErrorLog kullanımı
            ErrorLog.logError(e, "Olamaz!");
        }
```

## Özel mesaj?

Çökme raporunda özel bir mesaj belirte bilirsiniz. Örneğin:

```java
    ErrorLog.logError(e, "Olamaz!");

```
Olamaz! kısmı özel mesajdır ve çökme raporunda şöyle görünür:
  

  ```java
    Tarih: 2024-12-11 18:57:13
    Özel Mesaj: Olamaz!

```
## Log dosyası?

Log dosyası **error_log.txt** olarak kayıt edilir ve konsola yazdırılır.


```log
==== HATA RAPORU ====
// Olamaz, yine mi?

Tarih: 2024-12-11 18:57:13
Özel Mesaj: Olamaz!

==== HATA ====

Hata Türü: java.lang.ArithmeticException
Hata Mesajı: / by zero

Yığın İzleme (Stack Trace):
	at d.d.main(d.java:13)

=====================

```

  
## Log dosyası'nın açıkayın

Log dosyası şu şekilde kayıt eder:

```txt
  Tarih: 2024-12-11 18:57:13 // Hatanın oluştuğu tarih.
  
  Özel Mesaj: Olamaz! //Kodda belirtilen özel mesaj. Örn: ErrorLog.logError(e, "Olamaz!");

  ==== HATA ==== // Hatanın anlatıldığı bölüm.

  Hata Türü: java.lang.ArithmeticException // Hata'nın türü

  Hata Mesajı: / by zero // Hata mesajı. /by zero kısmı hata mesajıdır. Bu sizde farklıdır.

  Yığın İzleme (Stack Trace):
	at d.d.main(d.java:13) // Hatanın tam mesajı.
```

  
## Yazarlar ve Teşekkür

- [@kaplanbedwars](https://www.github.com/kaplanbedwars) geliştirme için.

  
## UNUTMAYIN!

Bu kodu eklemek için bunlar zorunludur:

`import dev.kaplanbedwars.erormessage.ErrorLog;`

`} catch (Exception e) {
            // ErrorLog kullanımı
            ErrorLog.logError(e, "Olamaz!");
        }`

  
## Kullananlar

Bu proje aşağıdaki şirketler tarafından kullanılmaktadır:

- KaplanDEV


  
