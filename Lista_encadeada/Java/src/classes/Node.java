package classes;

public class Node {
    private Integer info;
    private Node proximo;

    public Node() {
        info = null;
        proximo = null;
    }

    public void setProximo(Node n){
        this.proximo = n;
    }

    public Node getProximo(){
        return this.proximo;
    }

    public void setInfo(int info){
        this.info = info;
    }
    public int getInfo() {
        return this.info;
    }
}
