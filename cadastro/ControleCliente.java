package cadastro;

public class ControleCliente {

    public static void main(String[] args) {

       
        Cliente<String, Integer> cliente = new Cliente<>(
            "Felipe",
            "Brasil",
            21,
            "Rua Luiz Carlos Ribeiro, Casa 207",
            "felipe.brasil@email.com"
        );

        
        cliente.imprimirCliente();

        
        System.out.println("\n>> Atualizando e-mail...\n");
        cliente.setEmail("felipe.brasil@email.com");
        cliente.imprimirCliente();
    }
}