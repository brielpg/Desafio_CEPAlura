package br.com.alura;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BuscarCEP teste1 = new BuscarCEP();

        System.out.println("Digite o cep que deseja buscar: ");
        String cep = scanner.next();

        try {
            Endereco novoEndereco = teste1.devolverJson(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.SalvarArquivoJson(novoEndereco);

        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
        }



    }
}