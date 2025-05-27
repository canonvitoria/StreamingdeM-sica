package br.com.alura.minhasmusicas.modelos;

public class Favorites {
     public void add(Audio audio){
         if (audio.getClassification() >= 9 ){
             System.out.println(audio.getTitle() + " é considerado sucesso pela galera");
         } else {
             System.out.println(audio.getTitle() + ": próxima reprodução");
         }
     }
}
