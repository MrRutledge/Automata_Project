import java.io.*;
import java.util.*;

/**
 * A Java application to demonstrate the minimised version of the DFA class by
 * using it to filter the standard input stream. Those
 * lines that are accepted by DFA are echoed and the "Word accepted"
 * printed while words that are rejected they are followed with "Word rejected"
 * 
 */
public class DFAFilter {
  private static Scanner newWord;

public static void main(String[] args) 
        throws IOException {

    DFA word = new DFA(); // The DFA
    
 // Get the word from the User
    System.out.println("\t\nWhat word would you like to test? \n \t");
    newWord = new Scanner(System.in);

    // Read and echo accepted words
    String w = newWord.nextLine();
    while (w!=null) {
      word.reset();
      word.process(w);
      // If the Word gets to the final state
       if (word.accepted()) System.out.println( w + " Word accepted");
       // if the word fails to get to the final state
         else{
           System.out.println("Word rejected sorry");}
       //Read the next word 
            w = newWord.nextLine();
       }
     }
  }
