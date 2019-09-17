package karumanchi.linkedlist;



public class CircularLinkedList {

    private CNode head;

    public  void printList(){
        CNode temp=head;

        if(head==null)return;

        if(head.getNextNode()==head){


            System.out.println(head.getData());
            return;
        }

        while (temp.getNextNode()!=head){
            System.out.println(temp.getData());
            temp=temp.getNextNode();
        }
        System.out.println(temp.getData());
    }

    // inserting node at the end of the list
    public void insert(int data){
        CNode node = new CNode(data);

        if(head==null){
            head=node;
            return;
        }


        CNode temp=head;

        while (temp.getNextNode()!=head){
            temp=temp.getNextNode();
        }
        temp.setNextNode(node);
        node.setPreviousNode(temp);
        node.setNextNode(head);
        head.setPreviousNode(node);


    }
    // reverse printing the list
    public void reversePrintList(){

        CNode temp=head;

        if(head==null)return;
        if(head.getNextNode()==head){
            System.out.println(head.getData());
            return;
        }

        temp=temp.getPreviousNode();

        while (temp!= head) {
            System.out.println(temp.getData());
            temp=temp.getPreviousNode();
        }

        System.out.println(temp.getData());
    }

    //inserting a node at the front of the list

    public void insertAtFront(int num){
        CNode node = new CNode(num);

        if(head==null){
            head=node;
            return;
        }

        node.setNextNode(head);
        node.setPreviousNode(head.getPreviousNode());
        head.getPreviousNode().setNextNode(node);
        head.setPreviousNode(node);

        head=node;


    }

    //deleting the last node in a circular list

    public void deleteLastNode(){
        if(count()==0)return;
        if(count()==1){
            head=null;
            return;
        }


        CNode temp=head;
        while (temp.getNextNode()!=head)temp=temp.getNextNode();

        CNode prev=temp.getPreviousNode();
        prev.setNextNode(temp.getNextNode());
        CNode next=temp.getNextNode();
        next.setPreviousNode(prev);
    }

    //deleting the first node in a circular list

    public void deleteFirstNode(){

        if(head==null)return;
        if(count()==1){
            head=null;
            return;
        }
        CNode next= head.getNextNode();
        CNode prev=head.getPreviousNode();
        next.setPreviousNode(prev);
        prev.setNextNode(next);
        head=next;


    }
    //counting the nodes in a circular list

    public int count(){
        if(head==null)return 0;

        int ct=1;
        CNode temp=head;

        while (temp.getNextNode()!=head){
            ct++;
            temp=temp.getNextNode();
        }

        return ct;
    }


    public static void main(String[] args) {

        CircularLinkedList myList = new CircularLinkedList();

        for (int i=1;i<10;i++)myList.insertAtFront(i);

        myList.printList();
        System.out.println();
        myList.reversePrintList();

        System.out.println("The count is "+myList.count());
        myList.deleteLastNode();

        System.out.println("The count is "+myList.count());

        System.out.println();
        myList.printList();
        System.out.println();
        myList.reversePrintList();

        myList.deleteFirstNode();
    System.out.println("First node deleted");
    myList.printList();
    System.out.println();
    myList.reversePrintList();
    }

    public CNode getHead() {
        return head;
    }
}

class CNode {

    private CNode previousNode;
    private CNode nextNode;
    private int data;

    public CNode(int data){
        this.data=data;
        this.previousNode=this;
        this.nextNode=this;
    }
    public CNode getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(CNode previousNode) {
        this.previousNode = previousNode;
    }

    public CNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(CNode nextNode) {
        this.nextNode = nextNode;
    }

    public int getData() {
        return data;
    }







}
