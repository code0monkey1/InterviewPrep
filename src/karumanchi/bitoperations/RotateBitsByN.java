package karumanchi.bitoperations;

import java.util.BitSet;

public class RotateBitsByN {

    public int getNumber() {
        return number;
    }

    private int number;


    public RotateBitsByN(int number ){
        this.number=number;

    }


    public void rotateLeftBy(int n){

    }

    public void rotateRightBy(int n){

        int leftShift=(this.number)>>n;
        int rigtShift=(this.number<<(count()+n));
        System.out.println("Left shift yeilds "+leftShift);
        System.out.println("Right shift yeilds "+rigtShift);
        this.number=((this.number)>>n)| (this.number<<(32-n));

    }

    public void rotateByRight(int n){
        int digits=count();
        int leftShift=this.number<<3;
        int rightShift=this.number>>(5);

        System.out.println("The left shift is "+leftShift);
        System.out.println("The right shift is "+rightShift);

        this.number=leftShift|rightShift;

        int result=0;
        for(int i=0;i<digits;i++){
            if( ((number>>1) & 1)!=0 )result+=(int)Math.pow(2,i);
            number=number>>1;
        }

    System.out.println("The result is "+result);
    }
    public int count(){
        int temp=number;
        int count=0;
        while (temp!=0){
            temp=temp>>1;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        //
        RotateBitsByN rotateBitsByN=new RotateBitsByN(229);
        //        System.out.println(rotateBitsByN.getNumber());
        //        rotateBitsByN.rotateRightBy(2);
        //        System.out.printf("%xF",rotateBitsByN.getNumber());
        System.out.println(rotateBitsByN.getNumber());
        rotateBitsByN.rotateByRight(3);
    }
}
