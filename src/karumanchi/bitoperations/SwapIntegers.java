package karumanchi.bitoperations;

public class SwapIntegers {

     public static void swap(int n ,int m){
    System.out.printf("initial n is %d and m is %d\n",n,m);
        n=n^m;
        m=n^m;
        n=n^m;

    System.out.printf("After swap n is %d and m is %d",n,m);
     }

  public static void main(String[] args) {
    //
      swap(2,5);

  }
}
