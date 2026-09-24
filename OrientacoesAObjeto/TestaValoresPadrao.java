package OrientacoesAObjeto;

public class TestaValoresPadrao {
    public static void main(String[] args) {
        //Criando o objeto conta para testar os valores padrões de Conta
        Conta conta01 = new Conta();
        //Adicionando valores em conta01
        conta01.saldo = 500.50;
        conta01.numero = 123;

        //Criando um Objeto Agencia Atraves de Conta

        conta01.agencia = new Agencia();

        //Adicioando valores aos atributos de Agencia atraves de conta
        conta01.agencia.numero = 10; 
        conta01.agencia.nome = "Agencia Central";


        //Printando os Valores de conta e Agencia
        System.out.println(conta01.saldo);
        System.out.println(conta01.numero);
        System.out.println(conta01.agencia.nome);
        System.out.println(conta01.agencia.numero);  
    }
}
