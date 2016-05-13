import java.lang.Math;
/**
 * This class is a solution to the infamous number of trailing zeros problem
 * @author Jeremi Frazier
 * @version 1.0
 */
public class Solution {
  /**
   * this method takes an integer input  and determines the number of trailing zeroes.
   * the solution is made to withstand even 1000! factorial!
   * @param n -the number
   * @return int -the number of trailing zeroes
   */
  public static int zeros(int n) {
  int numOfZeroes=0;
  while(n!= 0){
    numOfZeroes += (int)Math.floor(n/5);
    n/=5;
    }
    return numOfZeroes;
  }
}
