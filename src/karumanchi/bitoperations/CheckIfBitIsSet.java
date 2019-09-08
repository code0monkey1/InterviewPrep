package karumanchi.bitoperations;

public class CheckIfBitIsSet {
    private int n;


    public CheckIfBitIsSet(int n){
        this.n=n;
    }

    public boolean isSetBitAt(int index){

        return (n & (1<<(index)))==0?false:true;
    }

  public static void main(String[] args) {

    CheckIfBitIsSet check=new CheckIfBitIsSet(2);

    System.out.println("Is bit set at 1"+check.isSetBitAt(1));
    System.out.println("is bit set at 0"+check.isSetBitAt(0));

    int arr[]={2,4,4,5,5,5,5,2,2,1};

    int res=0;

    for (int i :arr )
        res^=i;

    System.out.println(res);
  }
}
