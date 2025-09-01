package AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    Map<String, String> mapContato = new HashMap<>();

    public void adicionarContato(String nome, String telefone){
    mapContato.put(nome, telefone);
        System.out.println("Contato adicionado: " + nome + " -> " + telefone);
    }
    public void buscarTelefone(String nome){
        if (mapContato.containsKey(nome)) {
            System.out.println("Telefone de " + nome + ": " + mapContato.get(nome));
        } else {
            System.out.println("Contato " + nome + " não encontrado!");
        }
    }
    public void listarContato(){
        System.out.println("Todos os contatos:");
        for (Map.Entry<String, String> entry : mapContato.entrySet()) {
            System.out.println("- " + entry.getKey() + ": " + entry.getValue());
        }
    }
    public void removerContato(String nome){
        mapContato.remove(nome);
        System.out.println("Contato " + nome + " removido!");
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarContato("felipe", "1197451-8654");
        agenda.adicionarContato("ashwaganda", "1477451-7841");
        agenda.adicionarContato("maicon", "1181547-6845");

        agenda.buscarTelefone("felipe");
        agenda.removerContato("felipe");
        agenda.listarContato();
    }
}
