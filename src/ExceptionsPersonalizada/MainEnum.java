package ExceptionsPersonalizada;

public class MainEnum {
    public static void main(String[] args) {
        Usuario admin = new Usuario("Dayvid", "dayvid788945", NivelAcesso.ADMIN);
        Usuario user = new Usuario("Maria", "maria454876", NivelAcesso.USER);
        Usuario visitante = new Usuario("João", "joao7844509", NivelAcesso.VISITANTE);

        admin.mostrarPermissoes();
        System.out.println();
        user.mostrarPermissoes();
        System.out.println();
        visitante.mostrarPermissoes();
    }
}
