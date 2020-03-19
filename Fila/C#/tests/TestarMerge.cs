namespace estrutura_de_dados.Fila.Testes
{
    class TestarMerge
    {
        public static void main()
        {
            TesteMerge();
        }

        private static void TesteMerge()
        {
            Fila f1 = new Fila();
            Fila f2 = new Fila();
            Merge m = new Merge();

            f1.Inicializa(3);
            f2.Inicializa(3);

            f1.Insere(10);
            f1.Insere(20);
            f1.Insere(30);

            f2.Insere(15);
            f2.Insere(30);
            f2.Insere(45);

            m.merge(f1, f2);
            m.Imprime();
        }
    }
}
