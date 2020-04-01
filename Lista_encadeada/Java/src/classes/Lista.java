package classes;

public class Lista {
    private Node Lista;

    public Lista() {
        Lista = null;
    }

    public boolean vazia() {
        return Lista == null;
    }

    public void inserePrimeiro(int info){
        Node novo = new Node();
        novo.setInfo(info);
        if(vazia()){
            Lista = novo;
        } else {
            Node aux = Lista;
            Lista = novo;
            Lista.setProximo(aux);
        }
    }

    public void insereDepois(Node node, int info){
        for(Node n = Lista; n != null; n = n.getProximo()){
            if(n == node){
                Node aux = Lista;
                Node _node = new Node();
                _node.setInfo(info);
                _node.setProximo(aux.getProximo());
            }
        }
    }

    public void insereUltimo(int info){
        Node novo = new Node();
        novo.setInfo(info);
        Lista.setProximo(novo);
    }

    public void insereOrdenado(int info){

    }

    public Node removePrimeiro() {
        Node itemRemovido = Lista;
        Lista = Lista.getProximo();
        return itemRemovido;
    }

    public Node removeUltimo(){
        Node aux = null;
        for(Node node = Lista; node != null; node = Lista.getProximo()){
            if(node.getProximo() == null){
                aux = node;
            }
        }
        return aux;
    }

    public Node remove(Node node){
        Node aux = null;
        for(Node n = Lista; n != null; n = Lista.getProximo()){
            if(node.getInfo() == n.getInfo()){
                aux = n;
            }
        }
        return aux;
    }

    public void imprime() {
        if(vazia()){
            System.out.println("Lista vazia");
        } else {
            for(Node n = Lista; n != null; n = n.getProximo()){
                System.out.println(n.getInfo());
            }
        }
    }
}
