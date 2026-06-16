package cadastro;

public class ControleCliente {

    public static void main(String[] args) {

        Cliente<String, Integer> cliente = new Cliente<>();

        cliente.setNome("Felipe");
        cliente.setSobrenome("Brasil");
        cliente.setIdade(21);
        cliente.setEndereco("Rua Luiz Carlos Ribeiro, Casa 207");
        cliente.setEmail("felipe@gmail.com");

        cliente.imprimirDados();
    }
}