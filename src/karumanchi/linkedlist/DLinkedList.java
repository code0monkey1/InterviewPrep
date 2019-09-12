package karumanchi.linkedlist;

import java.util.Objects;

public class DLinkedList<T> {

    private DNode<T> head;
    private DNode<T> tail;



    public DLinkedList(){

    }
    public int getCount(){

        DNode temp=head;
        int count=0;
        for(;temp!=null;temp=temp.getNextNode(),count++);

        return count;
    }


    public DNode getHead() {
        return head;
    }
    //Add a new value to the front of the list
    public void setHead(DNode head) {

        if(this.head==null){
        this.head=head;
        return;
        }

        head.setNextNode(this.head);
        this.head.setPreviousNode(head);
        this.head=head;


    }

    public DNode<T> getTail() {
        return tail;
    }

    public void setTail(DNode tail) {
        this.tail = tail;
    }

    //get value at given position
    public void removeHead(){

        if(head==null)return;
        if(getCount()==1){
            emptyList();
            return;
        }
        head=head.getNextNode();
        head.setPreviousNode(null);

    }

    public void removeTail(){

        DNode temp=getTail();
        tail=temp.getPreviousNode();
        tail.setNextNode(null);
    }
    public void emptyList(){
        removeTail();
        removeHead();
    }
    public DNode removeAt(int index){

        if(head==null||index>getCount())return null;

        DNode temp=head;

        if(index==0){
            emptyList();
            temp.setNextNode(null);
            return temp;
        }
        for (int i = 1; i <index; i++) {
            temp=temp.getNextNode();
        }

        return temp;
    }
    //find position of head value that is equal to a given value




    public DNode findNodeWith(int value){

        DNode searchNode=new DNode(value);

        DNode temp=head;

        while (temp!=null){
            if(temp.getData().equals(searchNode))return temp;
        }

        return null;
    }


    //Add a new value to the list at a given positon
    //Add a new value to the end of the list

    //Remove the value at a given position

    //Remove a node matching a specified node

    //REmove head value from the list

    //Remove the tail value from the list

    // Print the list

    public void printList(){

        DNode temp=head;

        while (temp!=null){
            System.out.println(temp.getData());
            temp=temp.getNextNode();
        }
    }

    // REmove everything from the list


    public static void main(String[] args) {
        //

        DLinkedList<Integer> myList=new DLinkedList<>();

        for (int i = 1; i < 10; i++) {
            myList.insert(i);
        }

        myList.printList();
    }

    private void insert(T data) {

        DNode node = new DNode(data);



        if(head==null){
            return;
        }
        DNode temp=getHead();


        while (temp.getNextNode()!=null)
            temp=temp.getNextNode();

        temp.setNextNode(node);
        node.setPreviousNode(temp);
        setTail(node);

    }
}

class DNode<T>{
    private DNode nextNode;
    private DNode previousNode;
    private T data;

    public DNode(T data) {
        this.data = data;
    }

    public T getData(){
        return data;
    }
    public DNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DNode nextNode) {
        this.nextNode = nextNode;
    }

    public DNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DNode previousNode) {
        this.previousNode = previousNode;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DNode<?> dNode = (DNode<?>) o;
        return Objects.equals(data, dNode.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
