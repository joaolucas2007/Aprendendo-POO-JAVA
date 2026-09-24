package OrientacoesAObjeto;

public class Conta {
    double saldo;
    int numero;
    Agencia agencia; // A classe Conta possui uma agencia associada a ela

    //Criando os metodos de Conta

    //Metodo para inserir um valor
    void deposita(double valor) {
    saldo +=valor;}

    //metodo para retirar um valor
    void saca(double valor) {
        saldo -= valor;
    }
}
