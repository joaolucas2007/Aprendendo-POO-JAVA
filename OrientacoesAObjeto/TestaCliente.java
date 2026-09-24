package OrientacoesAObjeto;
//Testando os atributos dos clientes
public class TestaCliente {
    public static void main(String[] args) {
        //Criando os 2 primeiros objetos
        Cliente cliente01 = new Cliente();
        Cliente cliente02 = new Cliente();

        //Adicionando valores aos atributos de Cliente
        cliente01.nome = "Joao";
        cliente01.Codigo = 1;

        //Adicionando valores aos atributos do cliente 02
        cliente02.nome = "Tiago";
        cliente02.Codigo = 2;

        //Printando na tela os dados dos atributos de cada cliente
        System.out.println("O primeiro cliente se chama: " + cliente01.nome + " Seu codigo é: " + cliente01.Codigo);
        System.out.println("O nome do segundo Cliente é" + cliente02.nome + " Seu Codigo é: " + cliente02.Codigo);

    }

}
