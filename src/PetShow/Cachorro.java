package PetShow;

public class Cachorro extends Pet implements Animal{
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    @Override
    public void brincar() {
        System.out.println(getNome() + " está correndo atrás do próprio rabo!");
    }
}
