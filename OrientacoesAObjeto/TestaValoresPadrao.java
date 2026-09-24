package OrientacoesAObjeto;

public class TestaValoresPadrao {
    public static void main(String[] args) {
        //Criando o objeto conta para testar os valores padrões de Conta
        Conta conta01 = new Conta();
        //Printando os Valores padrões de conta
        System.out.println(conta01.saldo);
        System.out.println(conta01.numero);
        System.out.print(conta01.agencia);
    }
}
