package LinkedList;

public class Node {
    private Integer info;
    private Node next;

    public Node() {
        info = null;
        next = null;
    }
    
    public Node getNext(){
        return this.next;
    }

    public int getInfo() {
        return this.info;
    }
    
    public void setNext(Node n){
        this.next = n;
    }

    public void setInfo(int info){
        this.info = info;
    }
}

