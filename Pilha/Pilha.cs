using System;

namespace estrutura_de_dados
{
    class Pilha
    {
        private int topo;
        private char[] dados;
        public Pilha(int tamanho)
        {
            dados = new char[tamanho];
            topo = -1;
        }

        public char Topo()
        {
            return dados[topo];
        }

        public bool Vazia()
        {
            return this.topo == -1;
        }

        public bool Cheia()
        {
            return topo >= dados.Length - 1;
        }

        public void Empilhar(char elem)
        {
            if(!Cheia())
            {
                topo += 1;
                dados[topo] = elem;
            } else
            {
                Console.WriteLine("Pilha cheia");
            }
        }

        public char Desempilhar()
        {
            if (Vazia())
            {
                Console.WriteLine("Pilha vazia");
                return ' ';
            } else
            {
                char aux = dados[topo];
                topo -= 1;
                return aux;
            }
        }
    }
}
