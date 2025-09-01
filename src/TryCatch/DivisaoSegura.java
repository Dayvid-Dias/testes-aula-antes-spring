package TryCatch;

import java.util.Scanner;

public class DivisaoSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        try{
            int numDividido = num1 / num2;
            System.out.println("Resultado da divisão: " + numDividido);
        } catch (ArithmeticException e){
            System.out.println("Erro: não é possível dividir por zero!");
        } finally {
            System.out.println("Operação finalizada!");
        }
        sc.close();
    }
}
