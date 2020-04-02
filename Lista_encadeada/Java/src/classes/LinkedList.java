package classes;

public class LinkedList {
    private Node List;

    public LinkedList() {
        List = null;
    }

    public boolean empty() {
        return List == null;
    }

    public void insertFirst(int info){
        Node newNode = new Node();
        newNode.setInfo(info);
        if(empty()){
            List = newNode;
        } else {
            Node aux = List;
            List = newNode;
            List.setNext(aux);
        }
    }

    public void insertAfter(Node node, int info){
        Node n = List;
        if(empty()){
            System.out.println("Empty list");
        } else {
            Node aux = List;
            Node _node = new Node();
            _node.setInfo(info);
            while(n != null){
                if(n.getInfo() == node.getInfo()){
                    _node.setNext(aux.getNext());
                    break;
                }
                n = n.getNext();
            }
        }
    }

    public void insertLast(int info){
        Node newNode = new Node();
        newNode.setInfo(info);
        if(empty()){
            List = newNode;
        } else {
            Node n = List;
            Node aux;
            while(n != null){
                if(n.getNext() == null){
                    aux = n;
                }
                n = n.getNext();
            }
            List.setNext(newNode);
        }
    }

    public void insertOrdered(int info){
        if(empty()){

        } else {

        }
    }

    public Node removeFirst() {
        Node removedNode = null;
        if(empty()){
            System.out.println("Cannot remove non existent node.");
        } else {
            removedNode = List;
            removedNode.setNext(null);
            List = List.getNext();
        }
        return removedNode;
    }

    public Node removeLast(){
        Node aux = List;
        Node n = List;
        if(empty()){
            System.out.println("Cannot remove non existent element.");
        } else {
            while(n != null && aux != null){
                if(n.getNext() == null){
                    aux = n;
                }
                n = n.getNext();
            }
        }
        return aux;
    }

    public Node remove(Node node){
        Node aux = null;
        Node n = List;
        if(empty()){
            System.out.println("Cannot remove non existent element.");
        } else {
            while(node.getInfo() != n.getInfo()){
                aux = n;
                n = n.getNext();
            }
        }
        return aux;
    }

    public void print() {
        Node n = List;
        if(empty()){
            System.out.println("The list is empty.");
        } else {
            while(n != null){
                System.out.println(n.getInfo());
                n = n.getNext();
            }
        }
    }

    public int length() {
        int size = 0;
        Node n = List;
        while(n != null){
            size++;
            n = n.getNext();
        }
        return size;
    }
}
