package PetShow;

public class Gato extends Pet implements Animal{
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " está ronronando!");
    }

    @Override
    public void brincar() {
        System.out.println(getNome() + " está brincando com um novelo de lã!");
    }
}
