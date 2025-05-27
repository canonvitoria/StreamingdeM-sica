package br.com.alura.minhasmusicas.modelos;

public abstract class Audio {
    private String title;
    private  int totalReproduction;
    private int totalLikes;
    private int classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproduction() {
        return totalReproduction;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public  int getClassification() {
        return classification;
    }

    public void like() {
        this.totalLikes++;
    }

    public void reproduce(){
        this.totalReproduction++;
    }
}
