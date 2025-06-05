class Retangulo {
    public float altura;
    public float largura;

    public Retangulo(float altura, float largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularArea() {
        return this.altura * this.largura;
    }

    public double calcularPerimetro() {
        return this.altura * 2 + this.largura * 2;
    }
}

class Quadrado extends Retangulo {
    public float lado;

    public Quadrado(float lado) {
        super(lado, lado);
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        int teste = 12313123;
        var retangulo = new Retangulo(10, 2);
        System.out.println(retangulo.calcularPerimetro());

        var quadrado = new Quadrado(10);
        System.out.println(quadrado.calcularPerimetro());
    }
}
