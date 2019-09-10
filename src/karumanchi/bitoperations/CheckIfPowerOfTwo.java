package karumanchi.bitoperations;

public class CheckIfPowerOfTwo {
  private int number;

  public CheckIfPowerOfTwo(int n) {
    this.number = n;
  }

  public boolean isPowerOfTwo() { //O(1) operation
    return ((number > 1) && (number & (number - 1)) == 0);
  }

  public static void main(String[] args) {
    //
    CheckIfPowerOfTwo check = new CheckIfPowerOfTwo(16);
    System.out.println(check.isPowerOfTwo());
  }
}
