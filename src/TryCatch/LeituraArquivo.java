package TryCatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {
    public static void main(String[] args){
        try{
        FileReader fr = new FileReader("arquivo.txt");
            BufferedReader br = new BufferedReader(fr);

            String linha;
            while ((linha = br.readLine()) != null){
                System.out.println(linha);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }finally {
            System.out.println("Operação finalizada");
        }
    }
}
