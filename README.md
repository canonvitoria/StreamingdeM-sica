# Sistema de Reprodução de Áudio em Java 🎵☕

Um projeto Java para gerenitar músicas e podcasts, desenvolvido durante o curso "Java: aplicando a Orientação a Objetos" da Alura.

## 📌 Visão Geral
Sistema que aplica conceitos de POO como:
- Herança
- Polimorfismo
- Encapsulamento
- Abstração

## ✨ Funcionalidades
-  Cadastro de músicas e podcasts
-  Classificação por reproduções/curtidas
-  Sistema de favoritos
-  Código reutilizável

## 🛠️ Tecnologias
- Java 17
- Paradigma OO
- Princípios SOLID

##  ▶️ Como Executar
```bash
git clone https://github.com/seu-usuario/sistema-audio-java.git
cd sistema-audio-java
javac src/br/com/alura/minhasmusicas/main/Main.java
java src/br/com/alura/minhasmusicas/main/Main
```

## 📂 Estrutura
src/
├── br/com/alura/minhasmusicas/
│   ├── modelos/
│   │   ├── Audio.java         # Superclasse
│   │   ├── Music.java         # Subclasse
│   │   ├── Podcast.java       # Subclasse
│   │   └── Favorites.java     # Gerenciador
│   └── main/
│       └── Main.java          # Execução

## 💡 Exemplo
```
Music musica = new Music("Bohemian Rhapsody", "Queen");
simularInteracoes(musica, 5000, false); // 5000 plays

Favorites favs = new Favorites();
favs.addFavorito(musica); // "Bohemian Rhapsody é sucesso!"
```

## 🔮 Melhorias Futuras
- Persistência com JDBC/JPA
- Interface gráfica (JavaFX)
- Testes unitários (JUnit)

## 🤝 Contribuição
Contribuições são bem-vindas! Abra issues ou PRs.

