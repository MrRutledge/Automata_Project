import java.io.*;
import java.util.*;
/**
 * A Java application to demonstrate the Bits0X class by
 * using it to filter the standard input stream.  Those
 * lines that are accepted by Bits are echoed to the
 * standard output.
 */
public class Bits1XParallelFilter {
  public static void main(String[] args) 
        throws IOException {

    Bits1XParallel m = new Bits1XParallel(); // the NFA
    Scanner in =  // standard input
      new Scanner(new File("bits.txt"));

    // Read and echo lines until EOF.

    String s = in.nextLine();
    while (s!=null) {
      m.reset();
      m.process(s);
      if (m.accepted()) System.out.println(s); // if bits accepted, otherwise skipped
      else {System.out.println(s + " not accepted");}
      s = in.next();
    }
  }
}
