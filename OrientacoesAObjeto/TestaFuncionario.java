package OrientacoesAObjeto;

public class TestaFuncionario {
    public static void main(String[] args) {
        
        //Criando um objeto para classe Funcionario
        Funcionario f1 = new Funcionario();

        //Adicionando valores a funcionario
        f1.nome = "Airton";
        //Salario já tem um parametro

        //alterando salario usando metodo
        f1.alteraSalario(400);
        //Retornando os dados sobre funcionarios
        System.out.println("Funcionario: " + f1.retornaDados());
    }
}
