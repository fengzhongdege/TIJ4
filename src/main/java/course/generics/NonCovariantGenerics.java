//: generics/NonCovariantGenerics.java
package course.generics; /* Added by Eclipse.py */
// {CompileTimeError} (Won't compile)
import java.util.*;

public class NonCovariantGenerics {
  // Compile Error: incompatible types:
  List<Fruit> flist = new ArrayList<Apple>();
} ///:~
