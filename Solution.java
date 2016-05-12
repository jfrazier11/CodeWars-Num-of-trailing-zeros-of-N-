import java.lang.Math;
public class Solution {

  public static int zeros(int n) {
  int numOfZeroes=0;
  while(n!= 0){
    numOfZeroes += (int)Math.floor(n/5);
    n/=5;
    }
    return numOfZeroes;
  }
}
