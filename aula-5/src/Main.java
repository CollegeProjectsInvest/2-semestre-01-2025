// Classe
class Pessoa {
    // Atributos
    public String email;
    public String senha;

    // Método construtor: inicializar um objeto
    public Pessoa(String email, String senha) {
        System.out.println("Construtor");
        this.email = email;
        this.senha = senha;
    }

    public Pessoa() {}

    // Métodos
    public void exibir() {
        System.out.println("Email: " + this.email);
        System.out.println("Senha: " + this.senha);
    }

    public String retornaString() {
        return "Tchau!";
    }

    public void comParametro(String algumaCoisa) {
        algumaCoisa = "Olá";
        System.out.println("Alguma coisa: " + algumaCoisa);
    }

    public static void metodoEstatico() {
        System.out.println("Estático");
    }
}

public class Main {
    public static void main(String[] args) {
        // Objeto
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        pessoa.exibir();
//        pessoa.email = "teste@mail.com";
//        pessoa.senha = "123";
//        pessoa.exibir();
//        String mensagem = pessoa.retornaString();
//        System.out.println(mensagem);

//        String valor = "Teste";
//        pessoa.comParametro(valor);
//        System.out.println("Valor: " + valor);

        // Estatico
//        Pessoa.metodoEstatico();
    }
}
