package br.com.alura.minhasmusicas.main;

import br.com.alura.minhasmusicas.modelos.Favorites;
import br.com.alura.minhasmusicas.modelos.Music;
import br.com.alura.minhasmusicas.modelos.PodCast;

public class Main {
    public static void main(String[] args) {
        Music kamaitachi = new Music();
        kamaitachi.setTitle("Rainha dos Bichos da Floresta");
        kamaitachi.setSinger("Rafael da Cruz");

        for (int i = 0; i < 1000; i++) {
            kamaitachi.reproduce();
        }

        for (int i = 0; i < 50; i++) {
            kamaitachi.like();
        }

        PodCast podcast = new PodCast();
        podcast.setTitle("Os Sócios");
        podcast.setHost("Bruno Perini e Manu");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduce();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.like();
        }

        Favorites favorites = new Favorites();
        favorites.add(podcast);
        favorites.add(kamaitachi);
    }
}
