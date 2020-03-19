public class ValidadorDeExpressoes {
    public boolean validarExpressao(String expressao) {
        Pilha elementos = new Pilha();
        elementos.cria_pilha(expressao.length());

        for(int i = 0; i < expressao.length(); i++){
            if(expressao.charAt(i) == '(' || expressao.charAt(i) == '{' || expressao.charAt(i) == '['){
                elementos.empilha(expressao.charAt(i));
            } else if((elementos.topo() == '(' && expressao.charAt(i) == ')')
                    || (elementos.topo() == '{' && expressao.charAt(i) == '}')
                    || (elementos.topo() == '[' && expressao.charAt(i) == ']') ){
                elementos.desempilha();
            }
        }
        return elementos.vazia();
    }
}