package karumanchi.bitoperations;

public class ToggleKthBit {

    private int n;

    public ToggleKthBit(int n){

        this.n=n;
    }

    public void toggleBitAt(int index){

        this.n=this.n^(1<<index);

    }

    public int getNumber(){
        return this.n;
    }

    public static void main(String[] args) {

        ToggleKthBit toggle= new ToggleKthBit(3);

        System.out.println(toggle.getNumber());

        toggle.toggleBitAt(1);

        System.out.println(toggle.getNumber());
    }
}
