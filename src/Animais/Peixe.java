package Animais;

public class Peixe extends Animal implements Nadador{
    public Peixe(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Glub Glub do " + getNome());
    }

    @Override
    public void nadar() {
        System.out.println( getNome() + " está nadando!");
    }
}
