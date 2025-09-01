package PetShow;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bolt", 2);
        Gato gato = new Gato("Mittens", 3);

        List<Pet> listaPets = new ArrayList<>();
        listaPets.add(cachorro);
        listaPets.add(gato);

        for (Pet pet : listaPets){
            System.out.println("Nome do pet: " + pet.getNome());
            System.out.println("Idade do pet: " + pet.getIdade());
            pet.emitirSom();
            pet.brincar();
        }
    }
}
