//: concurrency/SerialNumberGenerator.java
package course.concurrency; /* Added by Eclipse.py */

public class SerialNumberGenerator {
  private static volatile int serialNumber = 0;
  public static int nextSerialNumber() {
    return serialNumber++; // Not thread-safe
  }
} ///:~
