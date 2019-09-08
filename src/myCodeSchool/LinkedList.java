package myCodeSchool;

public class LinkedList<T> {
    private Node<T> head;
    private int index;

    public LinkedList(){
        index =-1;
        head =null;

    }

    public Node getHeadNode(){return head;}


    public void insertAtIndex(int index,T value){

        Node node=new Node(value);

        if(index>this.index)throw new IllegalArgumentException("Illegal Index");

        else if(index==0){
            node.setNextNode(head);
            head=node;
        }
        else {
            Node temp= head;
            for(int i=0;i<index-1;i++) {
                temp=temp.getNextNode();
            }

            Node nextNode=temp.getNextNode();
            temp.setNextNode(node);
            node.setNextNode(nextNode);
        }

        this.index++;
    }

    public void removeAtIndex(int index){
        if(this.index ==-1 )return;
        if(this.index<index)return;


        if(index==0) head = head.getNextNode();
        else {
            int initIndex = 0;
            Node temp = head;

            while (initIndex < index - 1) {
                temp = temp.getNextNode();
            }
            Node next=temp.getNextNode().getNextNode();
            temp.setNextNode(next);
        }
        this.index--;
    }

    public void insert(T value){


        Node myNewNode = new Node(value);
        if (head ==null){
            head =myNewNode;
        }
        else {
            Node temp = head;
            while (temp.getNextNode() != null) {
                temp = temp.getNextNode();

            }
            temp.setNextNode(myNewNode);
        }
        this.index++;
    }

    public void printList(){

        Node temp= head;

        while (temp!=null){
            System.out.println(temp.getNodeData());
            temp=temp.getNextNode();
        }
        System.out.println();
    }

    public void remove(){


        if(head ==null){
            return;
        }
        if(head.getNextNode()==null){
            head =null;
            index=-1;
            return;
        }
        Node temp= head;
        while (temp.getNextNode().getNextNode()!=null)temp=temp.getNextNode();
        temp.setNextNode(null);

    }

    public void reversePrintListIterative(){
        String str="";

        Node temp=head;

        while (temp!=null){
            str=Integer.toString((int)temp.getNodeData())+" "+str;
            temp=temp.getNextNode();
        }
        System.out.println(str);
    }

    public void reverseList(Node node){

        if(node.getNextNode()==null){
            head =node;
            return;
        }
        reverseList(node.getNextNode());

        Node nextNode=node.getNextNode();
        nextNode.setNextNode(node);
        node.setNextNode(null);
    }

    public void reversePrintRecursive(Node node){

        if(node==null)return;

        reversePrintRecursive(node.getNextNode());

        System.out.print(node.getNodeData()+" ");

    }

    public void reverseListIterative(){
    //***********Important*******You forgot how to implement it*********//
        Node prev=null;
        Node current=head;
        while (current!=null){
            Node next= current.getNextNode();
            current.setNextNode(prev);
            prev=current;
            current=next;
        }

        head=prev;
    }

    public int getSize(){
        return index +1;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();

        list.insert(2);
        list.insert(4);
        list.insert(5);
        list.insert(8);
        list.printList();

        list.reverseListIterative();

        list.printList();
//
//        list.reversePrintListIterative();
//
//        list.reversePrintRecursive(list.getHeadNode());
//
//        list .reverseList(list.getHeadNode());
//        System.out.println();
//        list.reversePrintListIterative();
//
//        list.reversePrintRecursive(list.getHeadNode());

        list.insertAtIndex(2,50000);

        list.printList();
    }




}

class Node<T>{
    private Node next;
    private T data;

    public Node(T data){
        this.data=data;
    }
    public void setNextNode(Node node){
        next=node;
    }
    public Node getNextNode(){ return next; }
    public T getNodeData(){return data;}

}
