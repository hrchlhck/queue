package Testes;

import Classes.Fila;

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
        f.insere(4);
        f.insere(8);
        f.insere(16);
        f.insere(32);
    }

    private static void testarMetodoImprimeSemRemocao(Fila f) {
        f.imprime();
    }

    private static void testarMetodoImprimeComRemocao(Fila f){
        f.remove();
        f.remove();
        f.imprime();
    }

    private static void testarMetodoImprimeComRemocaoEInsercao(Fila f){
        f.insere(100);
        f.imprime();

        f.insere(9);
        f.imprime();
    }
}
