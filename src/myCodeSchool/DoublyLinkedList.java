package myCodeSchool;

public class DoublyLinkedList<T> {
    NodeDouble<T> head;
    NodeDouble<T> tail;
    int index=-1;


    public void printList(){

        NodeDouble temp=head;

        while (temp!=null){
            System.out.print(temp.getData()+" ");
            temp=temp.getNextNode();
        }
        System.out.println();
    }

    public void setTail(NodeDouble node){
        this.tail=node;
    }

    public NodeDouble getTail(){
        return tail;
    }

    public int size(){
        return index+1;
    }

    public NodeDouble getHead(){
        return head;
    }

    public void addNode(T data){
        NodeDouble node = new NodeDouble(data);

        this.index++;

        if(head==null){
            head=node;
            return;
        }

        NodeDouble temp=head;

        while (temp.getNextNode()!=null){
            temp=temp.getNextNode();
        }
        node.setPreviousNode(temp);
        temp.setNextNode(node);
        setTail(node);
    }
    public void printReverseList(){
        NodeDouble temp=tail;

        while (temp!=null){
            System.out.print(temp.getData()+" ");
            temp=temp.getPreviousNode();
        }
        System.out.println();
    }

    public void reverseListIterative(){


        NodeDouble previous=null;
        NodeDouble current=head;
        tail=current;

        while (current!=null){

            NodeDouble next=current.getNextNode();

            current.setNextNode(previous);
            current.setPreviousNode(next);

            previous=current;
            current=next;
        }

        head=previous;
    }
    public void removeTail(){
        if(index==-1 )return;
        if(index==0){
            head=null;
            index--;
            return;
        }
        tail.getPreviousNode().setNextNode(null);
        tail=tail.getPreviousNode();
        index--;
    }
    public void removeAtIndex(int index){
        if(index>this.index)throw new IndexOutOfBoundsException("This index does not exist");
        if(index==this.index){
            removeTail();
            return;
        }
        NodeDouble temp=head;


        for (int i=0;i<index;i++){
            temp=temp.getNextNode();
        }

        NodeDouble prev=temp.getPreviousNode();
        NodeDouble next=temp.getNextNode();
        prev.setNextNode(temp.getNextNode());
        next.setPreviousNode(temp.getPreviousNode());
        this.index--;

    }

    public void reverseListRecursive(NodeDouble node){
        if(node==null)return;
        if(node.getNextNode()==null){
            head=node;
            head.setNextNode(head.getPreviousNode());
            head.setPreviousNode(null);
            return;
        }
        reverseListRecursive(node.getNextNode());

        NodeDouble prev=node.getPreviousNode();
        node.setPreviousNode(node.getNextNode());
        node.setNextNode(prev);


    }


    public static void main(String[] args) {
        DoublyLinkedList<Integer> myList=new DoublyLinkedList<>();

        myList.addNode(2);
        myList.addNode(3);
        myList.addNode(8);
        myList.addNode(90);
    System.out.println(myList.index);
         myList.printList();
         myList.printReverseList();

         myList.removeAtIndex(1);
    System.out.println(myList.index);
         myList.printList();
         myList.printReverseList();

         myList.addNode(800);
         myList.printList();
    System.out.println(myList.index);

    myList.removeAtIndex(3);
    myList.printReverseList();
    System.out.println(myList.index);

    myList.reverseListRecursive(myList.getHead());
    myList.printList();
    }
}



class NodeDouble<T> {

    public NodeDouble(T data){
        this.data=data;
    }
    private NodeDouble previousNode;
    private  NodeDouble nextNode;
    private T data;

    public T getData() {
        return data;
    }

    public NodeDouble getNextNode() {
        return nextNode;
    }

    public NodeDouble getPreviousNode(){
        return previousNode;
    }

    public void setNextNode(NodeDouble nextNode){
        this.nextNode=nextNode;
    }

    public void setPreviousNode(NodeDouble previousNode){
        this.previousNode=previousNode;
    }



}
