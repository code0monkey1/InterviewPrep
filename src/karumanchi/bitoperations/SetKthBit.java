package karumanchi.bitoperations;

public class SetKthBit {

    private int n;

    public SetKthBit(int n){
        this.n=n;
    }

    public void setBitAt(int index){

        this.n=(n |(1<<index));
    }

    public int getNumber(){
        return this.n;
    }

  public static void main(String[] args) {
    //

      SetKthBit set=new SetKthBit(3);

    System.out.println(set.getNumber());

    set.setBitAt(2);

    System.out.println(set.getNumber());
  }
}
