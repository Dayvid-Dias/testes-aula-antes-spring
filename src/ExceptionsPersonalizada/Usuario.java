package ExceptionsPersonalizada;

public class Usuario {
    private String nome;
    private String login;
    private NivelAcesso nivel;

    public Usuario(String nome, String login, NivelAcesso nivel) {
        this.nome = nome;
        this.login = login;
        this.nivel = nivel;
    }

    public void mostrarPermissoes(){
        System.out.println("Usuário: " + nome + " | Nível: " + nivel);

        switch (nivel) {
            case ADMIN -> System.out.println("Permissões: acesso total, gerenciar usuários, configurar sistema");
            case USER -> System.out.println("Permissões: criar e editar conteúdo, visualizar relatórios");
            case VISITANTE -> System.out.println("Permissões: apenas visualizar conteúdo");
        }
    }

    public String getNome() {
        return nome;
    }

    public NivelAcesso getNivel() {
        return nivel;
    }
}
