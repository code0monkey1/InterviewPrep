package karumanchi.bitoperations;

public class CountNumberOfSetBits {

    private int n;

    public CountNumberOfSetBits(int n){
        this.n=n;
    }

    public int count(){
        int tot=0;
        while (n!=0){
            if((n&1)!=0)tot++;
            n=n>>1;
        }

        return tot;
    }

    public int count_mod(){
        int total=0;
        while (this.n!=0){
            if(this.n%2==1){
                total++;
            }
            this.n/=2;
        }
        return total;
    }

    public int count_toggle(){ //time complexity O(b) where b is the number of setBits
        int total=0;

        while (n!=0){
            total++;
            n=(n&(n-1));
        }

        return total;
    }

    public int count_preProcess(){
        int hash[]={0,1,1,2}; // bits in the diff combinations of 2^2

        int total=0;

        while (this.n!=0){

            int num=this.n&3;
            total+=hash[num];
            this.n=this.n>>2;   // Complexity b/2 ( where b is the number of setBits )
            // Complexity can be b/t ( where t is the number of bits that have been preprocessed )
        }

        return total;
    }



  public static void main(String[] args) {
    //
      CountNumberOfSetBits countBits=new CountNumberOfSetBits(7);

    System.out.println(countBits.count_preProcess());
    }
}
