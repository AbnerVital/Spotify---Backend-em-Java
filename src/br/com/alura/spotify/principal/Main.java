package br.com.alura.spotify.principal;

import br.com.alura.spotify.modelos.Musica;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();

        musica1.setTitulo("Ela e Ela");
        musica1.curtir();
        musica1.curtir();
        musica1.curtir();
        System.out.println(musica1.getCurtidas());
        musica1.reproduzir();
        musica1.reproduzir();
        System.out.println(musica1.getTotalReproducoes());
    }
}
