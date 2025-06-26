//import java.util.ArrayList;
//
//interface IVeiculo {
//    void acelerar();
//    void frear();
//}
//
//class Carro implements IVeiculo {
//    @Override
//    public void acelerar() {
//
//    }
//
//    @Override
//    public void frear() {
//
//    }
//}
//
//class Moto implements IVeiculo {
//    @Override
//    public void acelerar() {
//
//    }
//
//    @Override
//    public void frear() {
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        ArrayList<IVeiculo> veiculos = new ArrayList();
//
//        var carro = new Carro();
//        var moto = new Moto();
//
//        veiculos.add(carro);
//        veiculos.add(moto);
//    }
//}

// classe pai
class Animal {
    public void fazerSom() {}
}

// classe filha
class Cachorro extends Animal {}
class Gato {}

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
    }
}
