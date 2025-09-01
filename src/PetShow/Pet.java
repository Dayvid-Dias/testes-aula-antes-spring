package PetShow;

public abstract class Pet implements Animal {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pet(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void brincar();
}
