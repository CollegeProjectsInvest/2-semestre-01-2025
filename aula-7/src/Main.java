class Animais {
    public String especie;
    public String nome;
    public int idade;

    public void emitirSom() {
        System.out.println(this.nome + " está emitindo som.");
    }

    public void andar() {
        System.out.println("Andar");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Idade: " + this.idade);
    }
}

class AnimaisDomesticos extends Animais {
    public void treinar() {
        System.out.println("Treinar");
    }
}

class Cachorro extends AnimaisDomesticos {
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("AuAu Latindo!!");
    }
}

class Gato extends AnimaisDomesticos {
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Miau!");
    }

    public void escalar() {
        System.out.println("Escalar");
    }
}

class Passaro extends Animais {
    public void voar() {
        System.out.println("Voando!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.especie = "Pitbull";
        cachorro.idade = 14;
        cachorro.nome = "Rex";
        cachorro.emitirSom();
        cachorro.andar();
    }
}
