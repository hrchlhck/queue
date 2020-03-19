using System;

namespace estrutura_de_dados.Fila
{
    class TestarFila
    {       
        public static void main()
        {
            string sep = "----------------------------------------------------------------------\n";

            TestarInicializacao();
            Console.WriteLine(sep);

            TestarInsercaoElementos();
            Console.WriteLine(sep);

            TestarRemocaoElementos();
            Console.WriteLine(sep);

            TestarImprimir();
            Console.WriteLine(sep);
        }

        public static void TestarInicializacao()
        {
            Console.WriteLine("Iniciando teste 1");
            Fila fila = new Fila();
            fila.Inicializa(10);
            Console.WriteLine("Incializado com sucesso");
        }

        public static void TestarInsercaoElementos()
        {
            Console.WriteLine("Iniciando teste 2");
            Fila fila = new Fila();

            fila.Inicializa(5);

            fila.Insere(10);
            fila.Insere(20);
            fila.Insere(30);
            fila.Insere(40);
            fila.Insere(50);

            fila.Imprime();

            fila.Insere(60);
        }

        public static void TestarRemocaoElementos()
        {
            Console.WriteLine("Testando remoção de elementos da fila.");
            Fila fila = new Fila();

            fila.Inicializa(5);

            fila.Insere(10);
            fila.Insere(20);
            fila.Insere(30);
            fila.Insere(40);
            fila.Insere(50);

            fila.Imprime();

            Console.WriteLine(fila.Remove());
            Console.WriteLine(fila.Remove());
            Console.WriteLine(fila.Remove());
            Console.WriteLine(fila.Remove());
            Console.WriteLine(fila.Remove());
            Console.WriteLine(fila.Remove());
        }

        public static void TestarImprimir()
        {
            Console.WriteLine("Testando método imprimir");
            Fila fila = new Fila();
            fila.Inicializa(5);

            fila.Insere(2);
            fila.Insere(4);
            fila.Insere(8);
            fila.Insere(16);
            fila.Insere(32);

            fila.Imprime();

            fila.Remove();
            fila.Remove();

            fila.Imprime();
        }
    }
}
