package karumanchi.bitoperations;

public class AddNumbersBitwise {

    public static int add(int a,int b){

        if(b==0)return a;

        return add(a^b,((a&b)<<1));
    }

  public static void main(String[] args) {
    //

     System.out.println( add(121,12) );
  }
}
