/**
 * DNA
 * <p>
 * A puzzle created by Zach Blick
 * for Adventures in Algorithms
 * at Menlo School in Atherton, CA
 *</p>
 * <p>
 * Completed by: Damian Villarreal-Ayala
 *</p>
 */

public class DNA {

    /**
     * TODO: Complete this function, STRCount(), to return longest consecutive run of STR in sequence.
     */
    public static int STRCount(String sequence, String STR) {
        // Used to track the longest consecutive run of STR
        int numOfConsecutive = 0;

        /*
          In this for loop, iterate through the sequence and search for instances of the STR
          Iterate by char, comparing char to first char of STR.
          Idea for checking if the selected section matches the STR is by turning STR & selected
          String section/chars into a unique # so that you can do faster comparisons.
          ideas/concerns:
          - BECAUSE there are only four letters (ACTG), we don't have to worry too much about the
          ASCII values adding together in a numerical order different from the order of the STR.
          WHat COULD be done? Create a separate checker that would take in the STR.length() chars
          starting at i, then compares the chars to the STR in the intended order. If the chars don't
          add up to the same value as the STR's unique number or fails a comparison within the helper, then
          reject.
         */
        /**
         * ASCII value for CAPITAL A is 65, Z is 90
         */
        for(int i = 0; i < 3; i++)
        {
            char monitored = sequence.charAt(i);

        }

        // Return 0 when there is no STR throughout the sequence
        return 0;
    }
}
