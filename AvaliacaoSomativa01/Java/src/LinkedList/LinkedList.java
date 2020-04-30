package LinkedList;

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
        if(empty()){
            insertFirst(info);
        } else {
            Node actual = List;
           while(true) {
               if (actual.getInfo() == node.getInfo()) {
                   Node aux = new Node();
                   aux.setInfo(info);
                   aux.setNext(actual.getNext());
                   actual.setNext(aux);
                   break;
               }

               if(actual.getNext() == null){
                   System.out.println("Non exist");
                   break;
               }
               actual = actual.getNext();
           }
        }
    }

    public void insertLast(int info){
        if(empty()){
            insertFirst(info);
        } else {
            Node newNode = new Node();
            newNode.setInfo(info);
            Node aux = List;
            while(true){
                if(aux.getNext() == null){
                    aux.setNext(newNode);
                    break;
                }
                aux = aux.getNext();
            }
        }
    }

    public void insertOrdered(int info){
        if(empty()){
            insertFirst(info);
        } else {
            if(!isOrdered()){
                System.out.println("Cannot insert element. The list is not ordered");
            } else {
                Node newNode = new Node();
                newNode.setInfo(info);
                Node actual = List;
                Node previous;
                boolean flagNextNull = true;
                boolean flagInfoInBetween = true;

                while(flagNextNull || flagInfoInBetween){
                    previous = actual;
                    actual = actual.getNext();

                    if(actual.getInfo() >= info && previous.getInfo() <= info){
                        newNode.setNext(actual);
                        previous.setNext(newNode);
                        flagInfoInBetween = false;
                    }

                    if(actual.getNext() == null){
                        actual.setNext(newNode);
                        flagNextNull = false;
                    }

                }
            }
        }
    }

    public Node removeFirst() {
        Node aux = new Node();
        if(empty()){
            System.out.println("Cannot remove non existent node.");
        } else {
            aux.setInfo(List.getInfo());
            aux.setNext(List.getNext());
            List = List.getNext();

        }
        return aux;
    }

    public Node removeLast(){
        if(empty()){
            System.out.println("Cannot remove non existent element.");
        } else if (length() == 1) {
            return removeFirst();
        } else {
            Node actual = List;
            Node previous = List;
            Node last = new Node();

            while(true){
                if(actual.getNext() == null){
                    last.setInfo(actual.getInfo());
                    if(last == actual){
                        List = null;
                    } else {
                        previous.setNext(null);
                    }
                    return last;
                } else {
                    previous = actual;
                    actual = actual.getNext();
                }
            }
        }
        return null;
    }

    public Node remove(Node node){
        if(empty()){
            System.out.println("Cannot remove non existent element.");
        } else {
            Node actual = List;
            Node previous = List;
            while(true){
                // Return the removed node
                if(node.getInfo() == actual.getInfo()){
                    Node aux = new Node();
                    aux.setInfo(actual.getInfo());
                    aux.setNext(actual.getNext());
                    if(previous == actual){
                        List = List.getNext();
                    } else {
                        previous.setNext(actual.getNext());
                    }
                    return aux;
                }
                if(actual.getNext() == null){
                    break;
                }
                previous = actual;
                actual = actual.getNext();
            }
        }
        return null;
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

    private boolean isOrdered() {
        Node list = List;
        int firstValue;
        int secondValue;
        while (list.getNext() != null) {

            firstValue = list.getInfo();
            list = list.getNext();
            secondValue = list.getInfo();

            if (firstValue > secondValue) {
                return false;
            }
        }
        return true;
    }
}
