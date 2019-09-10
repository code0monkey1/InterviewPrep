package karumanchi.bitoperations;

public class ToggleRightMostOneBit {
    private int n;

    public ToggleRightMostOneBit(int n){
        this.n=n;
    }

    public void toggle(){
        n=n&(n-1);
    }
    public int getNumber() {

        return this.n;
    }
    public static void main(String[] args) {
        //
        ToggleRightMostOneBit toggleRightMostOneBit=new ToggleRightMostOneBit(3);
        System.out.println(toggleRightMostOneBit.getNumber());
        toggleRightMostOneBit.toggle();
        System.out.println(toggleRightMostOneBit.getNumber());
        toggleRightMostOneBit.toggle();
        System.out.println(toggleRightMostOneBit.getNumber());
        toggleRightMostOneBit.toggle();
        System.out.println(toggleRightMostOneBit.getNumber());
    }


}
