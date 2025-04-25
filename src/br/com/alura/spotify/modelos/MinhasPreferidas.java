package br.com.alura.spotify.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println("\n" + audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos");
        } else {
            System.out.println("\n" + audio.getTitulo() + " também é um dos que todos está curtindo");
        }
    }
}
