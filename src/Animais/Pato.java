package Animais;

public class Pato extends Animal implements Voador, Nadador{
    public Pato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("quac quac do " + getNome());
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando!");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando!");
    }
}
