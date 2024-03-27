package br.com.alura;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void SalvarArquivoJson(Endereco endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        FileWriter file = new FileWriter("cep.json");
        file.write(gson.toJson(endereco));
        file.close();
    }
}
