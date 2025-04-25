package br.com.alura.spotify.modelos;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    public void inputDados(String titulo, String host, String descricao){
        this.titulo = titulo;
        this.host = host;
        this.descricao = descricao;
    }

    public void exibirInformacoesPodcast(){
        System.out.println("\nPodcast: " + titulo);
        System.out.println("Hosts: " + host);
        System.out.println("Descrição: " + descricao);
        totalReproducoesEhCurtidas();
    }

    public String getHost() {
        return host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
