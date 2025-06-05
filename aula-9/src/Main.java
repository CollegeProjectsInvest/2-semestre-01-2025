class Cliente {
    private String nome;
    private String cpf;
    private int idade;

    public void cadastrar() {
        System.out.println(this.nome);
    }

    // Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Marcos");
        System.out.println(cliente.getNome());
    }
}
