package classes;

public class Fila {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int tamanho;
    private int quantidadeElementos;

    public Fila(int tamanho) {
        dados = new int[tamanho];
        primeiro = -1;
        ultimo = -1;
        quantidadeElementos = 0;
        this.tamanho = tamanho;
    }

    public boolean Cheia() {
        return quantidadeElementos == tamanho;
    }

    public boolean Vazia() {
        return quantidadeElementos <= 0;
    }

    public void Insere(int elem) {
        if (!Cheia()) {
            if(primeiro <= -1 || ultimo <= -1) {
                primeiro = 0;
                ultimo = 0;
                dados[primeiro] = elem;
            } else {
                if(ultimo == tamanho - 1) {
                    ultimo = 0;
                } else {
                    ultimo++;
                }
                dados[ultimo] = elem;
            }
            quantidadeElementos++;
        } else {
            System.out.println("Não é possível inserir o valor " + elem + " na fila. Ela está cheia.");
        }
    }

    public int Remove() {
        int aux;
        if (!Vazia()) {
            quantidadeElementos--;
            if(primeiro == tamanho) {
                aux = dados[primeiro];
                primeiro = 0;
                return aux;
            } else {
                aux = dados[primeiro];
                primeiro++;
                return aux;
            }
        } else {
            System.out.println("Fila vazia. Não foi possível executar o método.");
            return -1;
        }
    }

    public void Imprime() {
        for(int i = primeiro; i < quantidadeElementos; i++){
            System.out.println(dados[i]);
        }
    }

    public int getQuantidadeElementos() {
        return this.quantidadeElementos;
    }
}

