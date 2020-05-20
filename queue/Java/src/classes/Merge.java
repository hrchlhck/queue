package classes;

public class Merge {
    private Fila A;
    private Fila B;
    private Fila C;
    private int tamanhoFila;

    public Merge(Fila A, Fila B){
        this.A = A;
        this.B = B;
        this.tamanhoFila = A.getQuantidadeElementos() + B.getQuantidadeElementos();
        this.C = new Fila(tamanhoFila);
    }

    public Fila merge(){
        if(!C.Cheia()){
            this.Ordena(getVetor());
            for(int i = 0; i < tamanhoFila; i++){
                C.Insere(getVetor()[i]);
            }
        }
        return C;
    }

    private int[] getVetor(){
        int[] vetor = new int[tamanhoFila];
        int i;
        for(i = 0; i < A.getQuantidadeElementos(); i++){
            int aux = A.Remove();
            vetor[i] = aux;
            System.out.println(aux);
        }

        for(int j = i; j < tamanhoFila; j++){
            int aux = B.Remove();
            vetor[j] = aux;
            System.out.println(aux);
        }
        return vetor;
    }

    private void Ordena(int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            for(int j = i + 1; j < vetor.length; j++){
                int aux;
                if(vetor[i] > vetor[j]){
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
    }
}
