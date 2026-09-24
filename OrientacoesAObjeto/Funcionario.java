package OrientacoesAObjeto;

public class Funcionario {
String nome;
double salario = 200.00;

//Criando os metodos de funcionarios
void alteraSalario(double valor) {
    salario += valor;}


//Criando metodo que mostra todos os dados do usuario

String retornaDados() {
    return nome + "-- Salario:" + salario;
}
}

