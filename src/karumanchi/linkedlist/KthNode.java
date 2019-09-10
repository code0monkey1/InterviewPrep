package karumanchi.linkedlist;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class KthNode {

    public static int find(int k, LinkedList<Integer> list) {

        Node<Integer> i = list.getHead();
        Node<Integer> j = list.getHead();
        while (true) {

            for (int m = 1;; ++m) {
                if (j.getNextNode()==null) return i.getData();
                j=j.getNextNode();

                if(m%k==0)i=i.getNextNode();
            }
        }

    }

    public static void main(String[] args) {
        //

        LinkedList<Integer> list = new LinkedList<>();

        for (int i =0; i < 14; i++){
            //
            list.insert(i);
        }

        System.out.println(find(3,list));
    }
}
