package TryCatch;

import java.util.Scanner;

public class ThrowThrows {

    public static void verificarIdade(int idade) throws Exception{
        if (idade < 18){
            throw new Exception("Menor de idade");
        }
        System.out.println("Maior de idade");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = sc.nextInt();

        try {
            ThrowThrows.verificarIdade(idade);
        }catch (Exception e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
}
