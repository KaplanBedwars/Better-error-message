## Nedir?
[(for the english version)](https://github.com/KaplanBedwars/Better-error-message/blob/main/README2.MD)
Sıkıcı hata mesajlarından sıkıldınızmı?
Bu kolay ve basit kod tüm mesajı görüntüler.

## Yükleme 

Bu kod'u kurmak ve kullanmak çok basittir. İşte bazı örnekler:

## Çökme

En BASİT kod aşşağıdaki gibidir.

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

Ama bitmedi!
Daha fazla detay eklemek için:
```java
try {
    String str = null;
    str.length(); // NullPointerException oluşturur
} catch (Exception e) {
    EnhancedErrorLog.logError(e, "NullPointerException yakalandı.", "CRITICAL", "tr");
}


  
```


DAHADA İŞLERİ KIZIŞTIRMAK İÇİN


```JAVA
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
                    "ing",
                    "Operation", "Accessing array",
                    "Index", "10"
            );
        }


    }
}
```

**Açıklacaysak:**

```java
ErrorLog.logError(
                    e, //ZORUNLU PARAMETRE
                    "Array index out of bounds.", //ÖZEL  MESAJ
                    "HIGH", //CİDDİYET
                    "ing", //DİL
                    "Operation", "Accessing array", // EK BİLGİLER KISMINA EKLENİR
                    "Index", "10" //EK BİLGİLER KISMINA EKLENİR
            );

```


**Ek bilgiler**

```
==== EK BİLGİLER ==== 
Operation: Accessing array
Index: 10
```

*Ayrıca kod, sistem özelliklerinide yazar.**


```
==== SİSTEM BİLGİLERİ ==== 
java.specification.version: 22
sun.cpu.isalist: amd64
...

```




## Ciddiyiet

`"CRITICAL"` kısmı ciddiyettir. El ile eklenir ve zorunlu değildir:


| Parametre | Ciddiyiet     | 
| :-------- | :------- | 
| `LOW` | `Düşük` | 
|`MEDIUM`    |     `Orta`    |
| `HIGH` | `Yüksek` | 
|   `CRITICAL`   |   `Kritik`      |


Bu kısımlar logda böyle görünür:
```txt
==== HATA RAPORU ====
// Sistem Hata Raporu
Tarih: 2024-12-12 13:36:35
Ciddiyet: Orta
Özel Mesaj: Olamaz!

```
Eğer ingilizce yazdırırsanız:
```
    ==== ERROR REPORT ====
// System Error Report
Date: 2024-12-12 13:48:39
Severity: CRITICAL
Custom Message: NullPointerException yakalandı.

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
// Sistem Hata Raporu
Tarih: 2024-12-12 13:52:30
Ciddiyet: HIGH
Özel Mesaj: Array index out of bounds.

==== HATA DETAYLARI ==== 
Hata Türü: java.lang.ArrayIndexOutOfBoundsException
Hata Mesajı: Index 10 out of bounds for length 5

==== EK BİLGİLER ==== 
Operation: Accessing array
Index: 10

==== SİSTEM BİLGİLERİ ==== 
java.specification.version: 22
sun.cpu.isalist: amd64
...


==== ÇÖZÜM ÖNERİLERİ ==== 
1. Hata mesajını inceleyerek kodunuzu kontrol edin.
2. Daha fazla yardım için sistem yöneticinize veya geliştiriciye başvurun.
==== YIĞIN İZLEME (STACK TRACE) ==== 
	at d.d.main(d.java:16)

========================


```

  
#

  
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


  
