package Animais;

public abstract class Animal {
    private String nome;

    public abstract void emitirSom();

    public void comer(){
        System.out.println(getNome() + " está comendo!");
    }

    public Animal(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
