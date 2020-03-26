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
        for(Node n = Lista.getProximo(); n != null; n = n.getProximo()){
            if(n == node){
                Node aux = Lista;
                Node _node = new Node();
                _node.setInfo(info);
                _node.setProximo(aux.getProximo());
            }
        }
    }

    public void insereUltimo(int info){
        Lista = new Node();
        Lista.setInfo(info);
    }

    public void insereOrdenado(int info){

    }

    public Node removePrimeiro() {
        return null;
    }

    public Node removeUltimo(){
        return null;
    }

    public Node remove(Node node){
        return null;
    }

    public void imprime() {
        if(vazia()){
            System.out.println("Lista vazia");
        } else {
            for(Node node = Lista.getProximo(); node != null; node = Lista.getProximo()){
                System.out.println(Lista.getInfo());
            }
        }
    }
}
