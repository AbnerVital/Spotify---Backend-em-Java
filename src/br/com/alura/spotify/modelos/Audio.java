package br.com.alura.spotify.modelos;

public class Audio {
    protected String titulo;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;

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
    }

    public void reproduzir(){
        this.totalReproducoes++;
    }

    public void totalReproducoesEhCurtidas(){
        System.out.println("Total de reproduções: " + totalReproducoes);
        System.out.println("Total de curtidas: " + curtidas);
    }


}
