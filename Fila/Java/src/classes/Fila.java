package Classes;

public class Fila {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int quantidadeElementos;
    private int tamanho;

    public Fila(int tamanho) {
        dados = new int[tamanho];
        primeiro = -1;
        ultimo = -1;
        quantidadeElementos = 0;
        this.tamanho = tamanho;
    }

    public boolean cheia() {
        return quantidadeElementos == tamanho;
    }

    public boolean vazia() {
        return quantidadeElementos <= 0;
    }

    public void insere(int elem){
        if(!cheia()){
            try{
                quantidadeElementos++;
                if(primeiro == -1 || ultimo == -1){
                    primeiro++;
                    ultimo++;
                    dados[primeiro] = elem;
                } else {
                    ultimo++;
                    dados[ultimo] = elem;
                }
            } catch (IndexOutOfBoundsException e){
                System.out.println("Fila cheia");
            }
        } else {
            System.out.println("Nao foi possivel insercao de elemento, pois a fila esta cheia");
        }
    }

    public int remove() {
        int aux = 0;
        if(!vazia()){
            quantidadeElementos--;
            try{
                if(primeiro != ultimo){
                    aux = dados[primeiro];
                    primeiro++;
                } else {
                    aux = dados[primeiro];
                    primeiro = -1;
                    ultimo = -1;
                }
            }catch (IndexOutOfBoundsException e){
                System.out.println("Classes.Fila vazia");
            }
            return aux;
        } else {
            System.out.println("Nao foi possivel remocao de elemento, pois a fila esta vazia");
            return -1;
        }
    }

    public void imprime() {
        for(int i = primeiro; i <= ultimo; i++){
            System.out.println(dados[i]);
        }
    }
}
