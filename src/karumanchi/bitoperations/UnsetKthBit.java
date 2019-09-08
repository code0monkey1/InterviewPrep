package karumanchi.bitoperations;

public class UnsetKthBit {

    private int n;

    public UnsetKthBit(int n){
        this.n=n;
    }

    public void unsetBitAt(int index){

        this.n=(this.n ^(1<<index));
    }
    public int getNumber(){
        return this.n;
    }

  public static void main(String[] args) {
    //
      UnsetKthBit unset=new UnsetKthBit()
  }
}
