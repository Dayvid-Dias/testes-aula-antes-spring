package AgendaContatos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agenda agenda = new Agenda();
        ListaTarefas listaTarefas = new ListaTarefas();

        boolean rodando = true;

        while (rodando) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Buscar telefone");
            System.out.println("3 - Listar contatos");
            System.out.println("4 - Remover contato");
            System.out.println("5 - Adicionar tarefa");
            System.out.println("6 - Listar tarefas");
            System.out.println("7 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    agenda.adicionarContato(nome, telefone);
                    break;
                case 2:
                    System.out.print("Nome do contato: ");
                    String busca = sc.nextLine();
                    agenda.buscarTelefone(busca);
                    break;
                case 3:
                    agenda.listarContato();
                    break;
                case 4:
                    System.out.print("Nome do contato a remover: ");
                    String remover = sc.nextLine();
                    agenda.removerContato(remover);
                    break;
                case 5:
                    System.out.print("Nova tarefa: ");
                    String tarefa = sc.nextLine();
                    listaTarefas.adicionarTarefa(tarefa);
                    break;
                case 6:
                    listaTarefas.listarTarefas();
                    break;
                case 7:
                    listaTarefas.listarTarefas();
                    System.out.print("Índice da tarefa a remover: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    listaTarefas.removerTarefa(index);
                    break;
                case 0:
                    rodando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        sc.close();
    }
}
