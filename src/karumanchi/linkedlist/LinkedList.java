package karumanchi.linkedlist;

public class LinkedList<T> {
    private Node head;
    private Node tail;
    private int index;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int count() {
        return this.index + 1;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public LinkedList() {
        this.index = -1;
    }

    public void insert(T data) {

        Node newNode = new Node(data);

        Node temp = head;

        if (head == null) {
            setHead(newNode);
            setTail(newNode);
            increaseSize();
            return;
        }

        while (temp.getNextNode() != null) temp = temp.getNextNode();

        temp.setNextNode(newNode);
        increaseSize();
    }

    public void decreaseSize() {
        -- this.index;
    }
    public void increaseSize(){
        ++this.index;
    }

    public void insertAtIndex(T data, int index) {}

    public Node delete(int index) {
        Node temp = head;
        if (index > this.index|| index< this.index) return null;

        if (index == 0) {
            decreaseSize();
            setHead(null);
            setTail(null);
            return temp;
        }

        for (int i = 0; i < index-1; i++) temp = temp.getNextNode();

        Node toReturn = temp.getNextNode();
        temp.setNextNode(temp.getNextNode().getNextNode());
        decreaseSize();
        return toReturn;
    }

    public void printList() {

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNextNode();
        }
    }

    public void deleteList(){

        setHead(null);
    }

    public static void main(String[] args) {
        //

        LinkedList<Integer> list = new LinkedList();
        System.out.println("The size before the first element added is "+list.count());
        list.insert(2);
        System.out.println("The size after the first element added is "+list.count());
        list.insert(4);
        System.out.println("The size after te second elemnt is added is "+list.count());
        list.printList();

        System.out.println("The size is "+list.count());
        Node node =list.delete(1);

        System.out.println("The deleted node "+node.getData());

        list.printList();

        System.out.println(list.count());
    }
}

class Node<T> {
    private Node nextNode;
    private T data;

    public Node(T data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
