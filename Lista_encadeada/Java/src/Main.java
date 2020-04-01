import classes.Lista;
import classes.Node;

public class Main {
    public static void main(String[] args){
        Lista l = new Lista();
        l.inserePrimeiro(1);
        l.inserePrimeiro(2);
        l.inserePrimeiro(3);
        l.inserePrimeiro(4);
        l.imprime();
        l.insereUltimo(10);
        l.imprime();

    }
}
