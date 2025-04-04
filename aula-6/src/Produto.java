public class Produto {
    public String nome;
    public double preco;
    public int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void atualizarEstoque(int valorAtualizado) {
        this.quantidadeEstoque = valorAtualizado;
    }

    public void aplicarDesconto(double valorDesconto) {
        this.preco -= valorDesconto;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço R$: " + this.preco);
        System.out.println("Quantidade: " + this.quantidadeEstoque);
    }
}
