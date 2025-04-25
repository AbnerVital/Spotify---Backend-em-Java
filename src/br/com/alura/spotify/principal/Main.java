package br.com.alura.spotify.principal;

import br.com.alura.spotify.modelos.Musica;
import br.com.alura.spotify.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.inputDados("Apesar de Você", "Chico Buarque (1978)", "Chico Buarque", "MPB / Protesto");
        for (int i = 0; i < 1000; i++) {
            musica1.reproduzir();
        }
        for (int i = 0; i < 50; i++) {
            musica1.curtir();
        }
        musica1.exibirInformacoesMusica();

        Podcast podcast1 = new Podcast();
        podcast1.inputDados("Os Sócios", "Bruno Perini e Malu Perini", "Bruno Perini e Malu Perini são sócios no matrimônio, na vida e nos negócios. Toda quinta-feira você pode esperar um podcast muito divertido e com convidados especiais para falar de temas relacionados ao mundo do empreendedorismo, dinheiro e desenvolvimento pessoal.");
        for (int i = 0; i < 1000 ; i++) {
            podcast1.curtir();
        }
        for (int i = 0; i < 5000 ; i++) {
            podcast1.reproduzir();
        }
        podcast1.exibirInformacoesPodcast();


    }
}
