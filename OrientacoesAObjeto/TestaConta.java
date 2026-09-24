package OrientacoesAObjeto;


public class TestaConta {
    public static void main(String[] args) {
        Conta conta01 = new Conta();
        //Adicionando valores ao objeto conta01
        conta01.numero = 10;
        conta01.saldo = 400;

        //Testando metodo de depositar na conta01
        conta01.deposita(500);


        //testando metodo de sacar dinheiro na cont01
        conta01.saca(200);


        // Testando metodo que retornar valor da conta
        System.out.println(conta01.consultaConta());




        //Printando o saldo na conta após depositar e sacar dinheiro
        System.out.println(conta01.saldo);
    }
}
