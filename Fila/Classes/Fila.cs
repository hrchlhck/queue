using System;

namespace estrutura_de_dados.Fila
{
    class Fila
    {
        private int primeiro;
        private int ultimo;
        private int[] dados;

        public void Inicializa(int n)
        {
            dados = new int[n];
            primeiro = 0;
            ultimo = -1;
        }

        public bool Cheia()
        {
            return ultimo >= dados.Length - 1;
        }

        public bool Vazia()
        {
            return ultimo - primeiro == -1;
        }

        public void Insere(int elem)
        {
            if (!Cheia())
            {
                ultimo++;
                dados[ultimo] = elem;
            } else
            {
                Console.WriteLine("Não é possível inserir o valor na fila. Ela está cheia.");
            }
        }

        public int Remove()
        {
            if (!Vazia())
            {
                int aux = dados[primeiro];
                primeiro++;
                return aux;
            } else
            {
                Console.WriteLine("Pilha vazia. Não foi possível remover elemento.");
                return -1;
            }
        }

        public void Imprime()
        {
            for(int i = primeiro; i < ultimo + 1; i++)
            {
                Console.WriteLine(dados[i]);
            }
        }

        public int getTamanho()
        {
            return this.ultimo + 1;
        }
    }
}
