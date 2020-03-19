public class Pilha {
    private int topo;
    private char[] dados;
    private int MAX;

    public void cria_pilha(int tamanho){
        /**
         * Creates a empty stack
         * @param tamanho size of the stack
         */
        this.dados = new char[tamanho];
        this.MAX = tamanho;
        this.topo = -1;
    }

    public int topo(){
        return dados[topo];
    }

    public boolean vazia() {
        return topo == -1;
    }

    public boolean cheia() {
        return topo == MAX - 1;
    }

    public void empilha(char elem){
        if(cheia()){
            System.out.println("Pilha cheia");
        } else {
            topo++;
            this.dados[topo] = elem;
        }
    }

    public char desempilha() {
        if(vazia()){
            System.out.println("Pilha vazia");
            return ' ';
        } else {
            char aux = this.dados[topo];
            topo--;
            return aux;
        }
    }
}
