/**
 * From the Group Work Team Alpha
 * Minimized version of DFA
 * Course Work one
 * @author Karim Minani
 * STUDENT ID 12053836
 * Using the Switch method
 */

/**
 * A deterministic finite-state automaton that 
 * Recognises strings that read 002k00
 * where 2k is an even number and K whole number made up of binary characters("0","1")
 * empty strings are not accepted unless they are in the middle of four 0
 * empty string is taken as a representation of even number 
 * (along with "0000", "1001100", "010011001", "000000" and so on).
 *  The DFA will reject other strings/ characters that don't contain 002k00
 *  It will reject words like ("000","lploi","010102","0011100") 
 * 
 */


public class DFA {

  /* 
   * Constants q0 through q9 represent states, and
   * a private int holds the current state code.
   * State Q9 will reject characters that don't belong in the language
   * are put in between the four "0000"
   */
	  private static final int q0 = 0;
	  private static final int q1 = 1;
	  private static final int q2 = 2;
	  private static final int q3 = 3;
	  private static final int q4 = 4;
	  private static final int q5 = 5;
	  private static final int q6 = 6;
	  private static final int q7 = 7;
	  private static final int q8 = 8;
	  private static final int q9 = 9;
	 

  private int state;

  /**
   * The transition function.
   * @param s state code (an int)
   * @param c char to make a transition on
   * @return the next state code
   */
  static private int alpha(int s, char c) {
	    switch (s) {
	      case q0: switch (c) {
	            case '0': return q1;
	            case '1': return q0; 
	            default: return q9;
	          }
	      case q1: switch (c) {
	            case '0': return q3;
	            case '1': return q0;
	            default: return q9;
	          }
	      case q2: switch (c) {
	            case '0': return q3;
	            case '1': return q4; 
	            default: return q9;
	          }
	      case q3: switch (c) {
	           case '0': return q6;
	           case '1': return q2; 
	           default: return q9;
	         }
	      case q4: switch (c) {
	           case '0': return q7;
	           case '1': return q2; 
	           default: return q9;
	        }
	      case q5: switch (c) {
	          case '0': return q6;
	          case '1': return q5; 
	          default: return q9;
	       }
	      case q6: switch (c) {
	          case '0': return q8;
	          case '1': return q5; 
	          default: return q9;
	       }
	      case q7: switch (c) {
	          case '0': return q8;
	          case '1': return q4; 
	          default: return q9;
	      }
	      case q8: switch (c) {
	          case '0': return q8;
	          case '1': return q8; 
	          default: return q9;
	      }  
	      default: return q9;
	    }
	  }

  /**
   * Reset the current state to the start state.
   */
  public void reset() {
    state = q0;
  }

  /**
   * Make one transition on each char in the given
   * string.
   * @param in the String to use
   */
  public void process(String in) {
         for (int i = 0; i < in.length(); i++) {
            char c = in.charAt(i);
             state = alpha(state, c);
    }
  }
  
  /**
   * Test whether the DFA accepted the string.
   * @return true if the final state was accepting
   */
  public boolean accepted() {
    return state==q8;
  }
}

