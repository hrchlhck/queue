using System;

namespace estrutura_de_dados
{
    class Teste
    {
        private readonly Pilha pil;

        public Teste(int tamanho)
        {
            TestarValidarExpressao();
        }

        private void TestarEmpilhamento()
        {      
            pil.Empilhar('a');
            pil.Empilhar('b');
            pil.Empilhar('c');
            pil.Empilhar('d');
            pil.Empilhar('e');
            pil.Empilhar('f');
        }

        private void TestarDesempilhamento()
        {
            Console.WriteLine(pil.Desempilhar());
            Console.WriteLine(pil.Desempilhar());
            Console.WriteLine(pil.Desempilhar());
            Console.WriteLine(pil.Desempilhar());
            Console.WriteLine(pil.Desempilhar());
            Console.WriteLine(pil.Desempilhar());
        }

        private void TestarValidarExpressao()
        {
            ValidadorExpressoes val = new ValidadorExpressoes();
            string str1 = "(2 * 2 + (2 * 3])";
            string str2 = "(2 * 2 + (2 * 3))";
            string str3 = "(]";

            Console.WriteLine(val.validar(str1));
            Console.WriteLine(val.validar(str2));
            Console.WriteLine(val.validar(str3));
        }
    }
}
