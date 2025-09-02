package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplosCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite o primeiro número: ");
            int num1 = sc.nextInt();
            System.out.println("Digite o segundo número: ");
            int num2 = sc.nextInt();
            System.out.println("Resultado da divisão: "+ num1 / num2);
        } catch (InputMismatchException | ArithmeticException e){
            System.out.println("Erro: " + e.getMessage());
        }finally {
            System.out.println("Programa encerrado.");
        }
        sc.close();
    }
}
