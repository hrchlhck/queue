namespace estrutura_de_dados
{
    class ValidadorExpressoes
    {
        public bool validar(string expr)
        {
            int tamanho_expr = expr.Length;
            Pilha elementos = new Pilha(tamanho_expr);
            for(int i = 0; i < tamanho_expr; i++)
            {
                if(expr[i] == '(' || expr[i] == '[' || expr[i] == '{')
                {
                    elementos.Empilhar(expr[i]);
                } else if((elementos.Topo() == '(' && expr[i] == ')') 
                    || (elementos.Topo() == '[' && expr[i] == ']') 
                    || (elementos.Topo() == '{' && expr[i] == '}'))
                {
                    elementos.Desempilhar();
                }
            }
            if (!elementos.Vazia())
            {
                return false;
            } else
            {
                return true;
            }
        }
    }
}
