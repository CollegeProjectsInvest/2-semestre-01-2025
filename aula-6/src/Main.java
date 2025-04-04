public class Main {
    public static void main(String[] args) {
        Produto carne = new Produto(
                "Carne",
                100,
                40
        );

        carne.exibirInformacoes();
        carne.aplicarDesconto(30);

        carne.exibirInformacoes();
    }
}
