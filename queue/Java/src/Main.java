import classes.Fila;
import classes.Merge;

public class Main {
    public static void main(String[] args) {
        Fila A = new Fila(2);
        Fila B = new Fila(3);

        A.Insere(64);
        A.Insere(81);

        B.Insere(-20);
        B.Insere(-40);
        B.Insere(-60);

        Merge m = new Merge(A, B);
        m.merge().Imprime();
    }
}
