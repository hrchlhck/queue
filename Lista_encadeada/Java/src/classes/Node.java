package classes;

public class Node {
    private Integer info;
    private Node next;

    public Node() {
        info = null;
        next = null;
    }

    public void setNext(Node n){
        this.next = n;
    }

    public Node getNext(){
        return this.next;
    }

    public void setInfo(int info){
        this.info = info;
    }

    public int getInfo() {
        return this.info;
    }
}
