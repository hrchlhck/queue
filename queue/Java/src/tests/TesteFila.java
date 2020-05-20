package tests;

import classes.Fila;

public class TesteFila {
    private static int tamanho = 5;
    private static Fila fila = new Fila(tamanho);

    public static void main(){
        System.out.println("Testando método 'insere'");
        testarMetodoInserir(fila);
        System.out.println("----------------------------\n");

        System.out.println("Testando método 'imprime' sem remoção de elementos");
        testarMetodoImprimeSemRemocao(fila);
        System.out.println("----------------------------\n");

        System.out.println("Testando método 'imprime' com remoção de elementos");
        testarMetodoImprimeComRemocao(fila);
        System.out.println("----------------------------\n");

        System.out.println("Testando método 'imprime' com remoção de elementos e inserção de novos elementos");
        testarMetodoImprimeComRemocaoEInsercao(fila);
        System.out.println("----------------------------\n");
    }

    private static void testarMetodoInserir(Fila f){
        f.Insere(2);
        f.Insere(4);
        f.Insere(8);
        f.Insere(16);
        f.Insere(32);
    }

    private static void testarMetodoImprimeSemRemocao(Fila f) {
        f.Imprime();
    }

    private static void testarMetodoImprimeComRemocao(Fila f){
        f.Remove();
        f.Remove();
        f.Imprime();
    }

    private static void testarMetodoImprimeComRemocaoEInsercao(Fila f){
        f.Insere(100);
        f.Imprime();

        f.Insere(9);
        f.Imprime();
    }
}
