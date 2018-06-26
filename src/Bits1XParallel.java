/** 
 * A nondeterministic finite-state automaton that
 * recognizes strings with 0 as the next-to-last
 * character.
 */
public class Bits1XParallel {
//the block chain in the midst
  /*
   * The current set of states, encoded bitwise: 
   * state i is represented by the bit 1<<i.
   */
  private int stateSet;
// This programme has been changed slightly however I am going to do my best to try to make is work

  /**
   * Reset the current state set to {the start state}.
   */
  public void reset() {
    stateSet = 1<<0; // {q0}
  }
  //
  
  // this is just an update on the readme.


  /*
   * The transition function represented as an array.
   * The set of next states from a given state s and 
   * character c is at delta[s,c-'0'].
   */
  static private int[][] delta = 
     {{1<<0, 1<<0|1<<1}, // delta[q0,0] = {q0}
                         // delta[q0,1] = {q0,q1}
      {1<<2, 1<<2}, // delta[q1,0] = {q2}
                    // delta[q1,1] = {q2}
      {0, 0}}; // delta[q2,0] = {}
               // delta[q2,1] = {}


  /**
   * Make one transition from state-set to state-set on 
   * each char in the given string.
   * @param in the String to use
   */
  public void process(String in) {
    for (int i = 0; i < in.length(); i++) {
      char c = in.charAt(i);
      int nextSS = 0; // next state set, initially empty
      for (int s = 0; s <= 2; s++) { // for each state s
        if ((stateSet & (1<<s)) != 0) { // if maybe in s
          try {
            nextSS |= delta[s][c-'0'];
          }
          catch (ArrayIndexOutOfBoundsException ex) {
            // in effect, nextSS |= 0
          }
        }
      }
      stateSet = nextSS; // new state set after c
    }
  }


  /**
   * Test whether the NFA accepted the string.
   * @return true if the final set includes 
   *         an accepting state.
   */
  public boolean accepted() {
    return (stateSet & (1<<2))!=0; // true if q2 in set
  }
}

