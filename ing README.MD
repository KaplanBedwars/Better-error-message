What is ##?

Tired of boring error messages?
This easy and simple code displays the whole message.

## Loading 

This code is very simple to install and use. Here are some examples:

## Crash

 The sample code is as follows.

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
    
## How to add

Adding this Class is very simple! First download **dev.kaplanbedwars.erormessage** from [ [(To download)](https://github.com/KaplanBedwars/Better-error-message/tree/main/src/main/java) then put it in your src folder.


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
// Oh no, not again?

Date: 2024-12-11 18:57:13
Private Message: Oh no!

==== ERROR ====

Error Type: java.lang.ArithmeticException
Error Message: / by zero

Stack Trace:
	at d.d.main(d.java:13)

=====================

```

  
## Explain the log file

The log file records as follows:

```txt
  Date: 2024-12-11 18:57:13 // Date the error occurred.
  
  Private Message: No! //Special message specified in the code. Ex: ErrorLog.logError(e, ‘Not possible!’);

  ==== ERROR ==== // Section describing the error.

  Error Type: java.lang.ArithmeticException // Type of the error

  Error Message: /by zero // Error message. /by zero is the error message. This is different for you.

  Stack Trace:
	at d.d.main(d.java:13) // Full error message.
```

  
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
