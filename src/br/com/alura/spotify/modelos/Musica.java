package br.com.alura.spotify.modelos;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;

    public void inputDados (String titulo, String album, String artista, String genero){
        this.titulo = titulo;
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }

    public void exibirInformacoesMusica(){
        System.out.println("\nMúsica: " + titulo);
        System.out.println("Album: " + album);
        System.out.println("Artista: " + artista);
        System.out.println("Gênero: " + genero);
        totalReproducoesEhCurtidas();
    }


    public String getAlbum() {
        return album;
    }


    public String getArtista() {
        return artista;
    }


    public String getGenero() {
        return genero;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() > 2000){
            return 10;
        } else {
            return 7;
        }
    }
}
