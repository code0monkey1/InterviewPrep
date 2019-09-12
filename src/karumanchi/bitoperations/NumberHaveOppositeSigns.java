package karumanchi.bitoperations;

public class NumberHaveOppositeSigns {

    public static boolean haveOppositeSign(int a, int b){

        return ((a>>31) ^ (b>>3))<0;
    }

  public static void main(String[] args) {
    //

    System.out.printf("%b",haveOppositeSign(8,8));
  }
}
