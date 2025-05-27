package br.com.alura.minhasmusicas.modelos;

public class Music  extends Audio {
    private String album;
    private String singer;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassification() {
        if (this.getTotalReproduction() > 2000) {
            return 10;
        } else {
            return 8;
        }
    }
}
