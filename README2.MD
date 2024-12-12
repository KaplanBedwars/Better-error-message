What is ##?
[(for the english version)](https://github.com/KaplanBedwars/Better-error-message/blob/main/README2.MD)
Tired of boring error messages?
This easy and simple code displays the whole message.

## Loading 

This code is very simple to install and use. Here are some examples:

## Crash

The simplest code is as follows.

```java
package d;

import dev.kaplanbedwars.erormessage.ErrorLog;

public class d {

    public static void main(String[] args) {

          //SAMPLE CRASH CODE

        try {
            // Potential error code
            int result = 10 / 0; // Sample error
        } catch (Exception e) {
            // ErrorLog usage
            ErrorLog.logError(e, ‘Not possible!’);
        }
    }
}


  
```

But it's not over!
To add more details:
```java
try {
    String str = null;
    str.length(); // Generates NullPointerException
} catch (Exception e) {
    EnhancedErrorLog.logError(e, ‘NullPointerException caught.’, ‘CRITICAL’, ‘tr’);
}


  
```


TO ESCALATE THINGS FURTHER


```JAVA
package d;

import dev.kaplanbedwars.erormessage.ErrorLog;

import java.util.HashMap;
import java.util.Map;

public class d {

    public static void main(String[] args) {

          //SAMPLE CRASH CODE

        try {
            int[] array = new int[5];
            int value = array[10]; // ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            ErrorLog.logError(
                    e,
                    ‘Array index out of bounds.’,
                    ‘HIGH’,
                    ‘ing’,
                    ‘Operation’, “Accessing array”,
                    ‘Index’, ’10’
            );
        }


    }
}
```

**Explanation:**

```java
ErrorLog.logError(
                    e, //MANDATORY PARAMETER
                    ‘Array index out of bounds.’, //SPECIAL MESSAGE
                    ‘HIGH’, //SERIOUSNESS
                    ‘ing’, //language
                    ‘Operation’, “Accessing array”, // ADDED TO ADDITIONAL INFORMATION
                    ‘Index’, “10” // ADDED TO SUPPLEMENTARY INFORMATION
            );

```


**Additional information**

```
==== ADDITIONAL INFORMATION ==== 
Operation: Accessing array
Index: 10
```

*The script also writes system properties.


```
==== SYSTEM INFORMATION ==== 
java.specification.version: 22
sun.cpu.isalist: amd64
...

```




## Seriousness

The `‘CRITICAL’` part is seriousness. It is added manually and is not mandatory:


| Parameter | Seriousness | 
| :-------- | :------- | 
| `LOW` | `Low` | 
| `MEDIUM` | `Medium` |
| `HIGH` | `High` | 
| `CRITICAL` | `Critical` |


These parts look like this in the log:
```txt
==== ERROR REPORT ====
// System Error Report
Date: 2024-12-12 13:36:35
Seriousness Medium
Private Message Oh, no!

```
If you print it in English:
```
    ==== ERROR REPORT ====
// System Error Report
Date: 2024-12-12 13:48:39
Severity: CRITICAL
Custom Message: NullPointerException caught.

```

## How to add

Adding this Class is very simple! First, download **dev.kaplanbedwars.erormessage** from [(To download)](https://github.com/KaplanBedwars/Better-error-message/tree/main/src/main/java), then put it in your src folder.


Open your code and add the following:

```java
  import dev.kaplanbedwars.erormessage.ErrorLog;
```

To reflect the error message:

```java
  try {
            // Potential error code
            int result = 10 / 0; // Sample error
        } catch (Exception e) {
            // ErrorLog usage
            ErrorLog.logError(e, ‘Not possible!’);
        }
```

## Private message?

You can specify a special message in the crash report. For example:

```java
    ErrorLog.logError(e, ‘No way!’);

```
The ‘Oh no!’ part is a private message and looks like this in the crash report:
  

  ```java
    Date: 2024-12-11 18:57:13
    Private Message Oh, no!

```
## Log file?

The log file is saved as **error_log.txt** and printed to the console.


```log

==== ERROR REPORT ====
// System Error Report
Date: 2024-12-12 13:52:30
Seriousness HIGH
Private Message: Array index out of bounds.

==== ERROR DETAILS ==== 
Error Type: java.lang.ArrayIndexOutOfBoundsException
Error Message: Index 10 out of bounds for length 5

==== ADDITIONAL INFORMATION ==== 
Operation: Accessing array
Index: 10

==== SYSTEM INFORMATION ==== 
java.specification.version: 22
sun.cpu.isalist: amd64
...


==== SOLUTION SUGGESTIONS ==== 
1. Check your code by analysing the error message.
2. Contact your system administrator or developer for further assistance.
==== STACK TRACE ==== 
	at d.d.main(d.java:16)

========================


```

  
#

  
## Authors and Acknowledgements

- [@kaplanbedwars](https://www.github.com/kaplanbedwars) for development.

  
## REMEMBER.

These are mandatory to add this code:

`import dev.kaplanbedwars.erormessage.ErrorLog;`

`} catch (Exception e) {
            // ErrorLog usage
            ErrorLog.logError(e, ‘It can't be!’);
        }`

  
## Those who use

This project is used by the following companies:

- KaplanDEV


  

Translated with DeepL.com (free version)
