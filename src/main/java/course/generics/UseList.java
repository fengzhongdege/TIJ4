//: generics/UseList.java
package course.generics; /* Added by Eclipse.py */
// {CompileTimeError} (Won't compile)
import java.util.*;

public class UseList<W,T> {
  void f(List<T> v) {}
  void f(List<W> v) {}
} ///:~
