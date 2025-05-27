package br.com.alura.minhasmusicas.modelos;

public class PodCast extends Audio {
    private String host;
    private String descript;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    @Override
    public int getClassification() {
        if (this.getTotalLikes() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
