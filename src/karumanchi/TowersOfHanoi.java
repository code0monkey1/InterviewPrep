package karumanchi;

public class TowersOfHanoi {

    public void move(int n, char frompeg, char topeg, char auxpeg) {

        move(n - 1, frompeg, auxpeg, topeg);
        System.out.println("Move 1 disk from peg " + frompeg + " to peg " + topeg);
        move(n - 1, auxpeg, topeg, frompeg);
    }

    public void move_2(int n,int frompeg, int auxpeg,int topeg){

        if(n==0)return;
        move_2(n-1,frompeg,topeg,auxpeg);
        System.out.printf("move 1 disk from %d to %d\n",frompeg,topeg);
        move_2(n-1,auxpeg,frompeg,topeg);


    }

    public static void main(String[] args) {
        //
        TowersOfHanoi toh=new TowersOfHanoi();
//        toh.move(1,'1','2','3');
        System.out.println("\n-------------------\n");
        toh.move_2(3,1,2,3);
    }
}
