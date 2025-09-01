package AgendaContatos;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    List<String> lista = new ArrayList<>();

    public void adicionarTarefa(String tarefa){
        lista.add(tarefa);
        System.out.println("Tarefa adicionada!");
    }
    public void removerTarefa(int index){
        lista.remove(index);
        System.out.println("Tarefa " + index + " removida!");
    }
    public void listarTarefas(){
        System.out.println("\nTarefas:\n");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i));
        }

    }
}
