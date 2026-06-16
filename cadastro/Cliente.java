package cadastro;

public class Cliente<T, U> {

    private T nome;
    private T sobrenome;
    private U idade;
    private T endereco;
    private T email;

    public Cliente(T nome, T sobrenome, U idade, T endereco, T email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.endereco = endereco;
        this.email = email;
    }

    public T getNome() {
        return nome;
    }

    public void setNome(T nome) {
        this.nome = nome;
    }

    public T getSobrenome() {
        return sobrenome;
    }

    public T setSobrenome(T sobrenome) {
        this.sobrenome = sobrenome;
    }

    public U getIdade() {
        return idade;
    }

    public U setIdade(U idade) {
        this.idade = idade;
    }

    public T getEndereco() {
        return endereco;
    }

    public T setEndereco(T endereco) {
        this.endereco = endereco;
    }

    public T getEmail() {
        return email;
    }

    public T setEmail(T email) {
        this.email = email;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Email: " + email);
    }
}