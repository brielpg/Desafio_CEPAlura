package br.com.alura;

public record Endereco(String logradouro, String bairro, String localidade, String uf) {

    @Override
    public String toString() {
        return String.format("%s, %s | %s (%s)",logradouro,bairro,localidade,uf);
    }
}
