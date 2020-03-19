using System;

namespace estrutura_de_dados.Fila
{
    class Fila
    {
        private int primeiro;
        private int ultimo;
        private int[] dados;
        private int tamanho;
        private int quantidadeElementos;

        public Fila(int tamanho)
        {
            dados = new int[tamanho];
            primeiro = -1;
            ultimo = -1;
            quantidadeElementos = 0;
            this.tamanho = tamanho;
        }

        public bool Cheia()
        {
            return quantidadeElementos == tamanho;
        }

        public bool Vazia()
        {
            return quantidadeElementos <= 0;
        }

        public void Insere(int elem)
        {
            if (!Cheia())
            {
                if(primeiro <= -1 && ultimo <= -1)
                {
                    primeiro++;
                    ultimo++;
                    dados[primeiro] = elem;
                } else
                {
                    if(ultimo == quantidadeElementos - 1)
                    {
                        ultimo = 0;
                        dados[ultimo] = elem;
                    } else
                    {
                        ultimo++;
                        dados[ultimo] = elem;
                    }
                }
                
            } else
            {
                Console.WriteLine("Não é possível inserir o valor na fila. Ela está cheia.");
            }
        }

        public int Remove()
        {
            int aux = 0;
            if (!Vazia())
            {
                if(primeiro == quantidadeElementos - 1)
                {
                    aux = dados[primeiro];
                    primeiro = 0;
                    return aux;
                } else
                {
                    aux = dados[primeiro];
                    primeiro++;
                    return aux;
                }
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
    }
}
