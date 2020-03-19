public class Main {
    public static void main(String[] args) {
        testaValidadorExpressao();
    }

    private static void testaPilha(){
        Pilha p = new Pilha();
        p.cria_pilha(4);
        p.empilha('1');

        p.empilha('0');
        p.empilha('3');
        p.empilha('2');

        try{
            System.out.println(p.desempilha());
            System.out.println(p.desempilha());
            System.out.println(p.desempilha());
            System.out.println(p.desempilha());
            System.out.println(p.desempilha());

        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    private static void testaValidadorExpressao(){
        String[] expr = {"(2 + 2)", "(2 + 2) * 3}", "2 * {([3]), 10)]", "((((((((((123213123132))))))))))", "((})"};
        ValidadorDeExpressoes vde = new ValidadorDeExpressoes();
        for(int i = 0; i < expr.length; i++){
            try{
                if(vde.validarExpressao(expr[i])){
                    System.out.println("Expressão " + expr[i] + " valida");
                }
            } catch (IndexOutOfBoundsException e){
                // ignora exception
            }
        }

    }
}
