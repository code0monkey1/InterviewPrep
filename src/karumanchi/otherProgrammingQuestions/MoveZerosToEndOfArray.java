package karumanchi.otherProgrammingQuestions;

public class MoveZerosToEndOfArray {

    private static void  swap(int[] arr,int indexA,int indexB ){

        int temp=arr[indexA];
        arr[indexA]=arr[indexB];
        arr[indexB]=temp;
    }
    private static void moveZerosToEnd(int[] arr){


        int j=0;
        int k=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]==0){
                if(j<i)j=i;
                while (j<arr.length&&arr[j]==0){
                    j++;
                }
                if(j==arr.length)return;

                swap(arr,i,j);

            }
        }

    }

    public static void main(String[] args) {
        int arr[]={2,4,0,6,6,0,0,9,0,1};
        moveZerosToEnd(arr);

        for (int i: arr){
            System.out.println(i);
        }

    }
}
