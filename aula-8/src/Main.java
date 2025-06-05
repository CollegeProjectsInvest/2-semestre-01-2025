class Cliente {
    protected String nome;
    protected int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    protected void cadastrar() {
        System.out.println("Nome Cliente: " + this.nome);
    }
}

class ClienteVip extends Cliente {
    public ClienteVip(String nome, int idade) {
        super(nome, idade); // chama o construtor da class pai
    }

    @Override
    protected void cadastrar() {
        super.cadastrar(); // chama método cadastrar da classe pai
        System.out.println("Nome Cliente Vip: " + this.nome);
    }
}

public class Main {
    public static void main(String[] args) {
        ClienteVip clienteVip = new ClienteVip("Marcos", 21);
        clienteVip.cadastrar();
    }
}
