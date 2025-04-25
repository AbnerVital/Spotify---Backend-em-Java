package br.com.alura.spotify.modelos;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int curtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public int getTotalReproducoes() {
        return totalReproducoes;
    }


    public int getCurtidas() {
        return curtidas;
    }


    public double getClassificacao() {
        return classificacao;
    }


    public void curtir(){
        this.curtidas++;
        System.out.println("Você acabou de curtis a música: " + this.titulo);
    }

    public void reproduzir(){
        this.totalReproducoes++;
        System.out.println("A musica " + this.titulo + " está reproduzindo.");
    }


}
