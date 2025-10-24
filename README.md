<p align="center">
  <img src="https://rickandmortyapi.com/api/character/avatar/1.jpeg" width="120" alt="Rick Sanchez">
  <img src="https://rickandmortyapi.com/api/character/avatar/2.jpeg" width="120" alt="Morty Smith">
</p>

<h1 align="center">🛸 Rick and Morty API em Java</h1>
<p align="center">Projeto simples feito com <b>Java e Spring Boot</b> para consumir a <a href="https://rickandmortyapi.com/">API pública do Rick and Morty</a> e exibir informações sobre os personagens digitados pelo usuário.</p>

Este projeto usa Java 17+, Spring Boot, HttpClient para requisições HTTP e Jackson para converter JSON em objetos Java. O usuário digita o nome de um personagem, e o programa retorna informações como nome, status, espécie e gênero.

Exemplo de execução:

```bash
Digite o nome do personagem de RICK AND MORTY:
rick

Personagem: Rick Sanchez
Status: Alive
Espécie: Human
Gênero: Male
Trecho do código principal:

java
Copiar código
public void exibeMenu() {
    System.out.println("Digite o nome do personagem de RICK AND MORTY: ");
    var nome = leitura.nextLine();
    var json = consumoApi.obterDados("https://rickandmortyapi.com/api/character/?name=" + nome.replace(" ", "+"));
    ResultadoApi resultado = conversor.obterDados(json, ResultadoApi.class);
    resultado.results().forEach(p -> {
        System.out.println("\nPersonagem: " + p.name());
        System.out.println("Status: " + p.status());
        System.out.println("Espécie: " + p.species());
        System.out.println("Gênero: " + p.gender());
    });
}
Como rodar: Tenha Java 17+ e Maven instalados, clone o projeto com git clone https://github.com/seuusuario/rick-and-morty-api-java.git e execute mvn spring-boot:run.

Desenvolvido  por Ze.
```
<p align="center"> <img src="https://rickandmortyapi.com/api/character/avatar/3.jpeg" width="100" alt="Summer Smith"> <img src="https://rickandmortyapi.com/api/character/avatar/4.jpeg" width="100" alt="Beth Smith"> <img src="https://rickandmortyapi.com/api/character/avatar/5.jpeg" width="100" alt="Jerry Smith"> </p> 
