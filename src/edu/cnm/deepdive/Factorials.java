package edu.cnm.deepdive;

public class Factorials {

  public static long computeRecursive(int n) throws IllegalArgumentException{
    if (n < 0) {
      throw new IllegalArgumentException();

    }
    return (n <= 1) ? 1 : (n * computeRecursive(n - 1));
  }

}
