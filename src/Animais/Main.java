package Animais;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("nick");
        Pato pato = new Pato("donald");
        Peixe peixe = new Peixe("nemo");

        cachorro.emitirSom();
        cachorro.comer();

        pato.emitirSom();
        pato.nadar();
        pato.voar();

        peixe.emitirSom();
        peixe.nadar();
        peixe.comer();

    }
}
