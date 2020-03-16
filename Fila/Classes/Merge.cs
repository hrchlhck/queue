namespace estrutura_de_dados.Fila
{
    class Merge
    {
        private Fila filaAuxiliar;

        public Merge()
        {
            Fila filaAuxiliar = new Fila();
        }
        public Fila merge(Fila fila1, Fila fila2)
        {
            filaAuxiliar.Inicializa(fila1.getTamanho() + fila2.getTamanho());
            while(!fila1.Vazia() && !fila2.Vazia())
            {
                filaAuxiliar.Insere(fila1.Remove());
                filaAuxiliar.Insere(fila2.Remove());
            }
            return this.filaAuxiliar;            
        }

        public void Imprime()
        {
            filaAuxiliar.Imprime();
        }
    }
}
