package TryCatch;

import java.util.Scanner;

public class ConversaoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um número: ");
            String num = sc.nextLine();
            int numConvertido = Integer.parseInt(num);
            System.out.println("número digitado: " + numConvertido);
        } catch(NumberFormatException e){
            System.out.println("Erro: você não digitou um número válido!");
        } finally {
            sc.close();
            System.out.println("Operação finalizada");
        }
    }
}
