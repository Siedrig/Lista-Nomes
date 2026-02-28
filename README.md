Projeto Java simples para gerenciar uma lista de nomes via menu interativo.
Código organizado em classes separadas: Main (entrada), ListaNomes (interface/menu) e MetodosLista (lógica de manipulação da lista).
Estrutura do projeto

pom.xml — configuração do Maven.
java
Main.java — método main, instancia ListaNomes e inicia o menu.
ListaNomes.java — implementa o menu e interações com o usuário.
MetodosLista.java — contém os métodos que manipulam a coleção de nomes (adição, remoção, listagem, etc.).
classes — classes compiladas pelo Maven.
Requisitos

Java JDK (versão compatível com o projeto).
Maven (opcional, para build).
Como compilar e executar

Pelo Maven:
Compilar: mvn compile
Gerar JAR (opcional): mvn package
Pela linha de comando (após compilar):
java -cp target/classes Main
Ou abrir o projeto na sua IDE (Ex.: IntelliJ, Eclipse) e executar Main.
Uso (exemplo)

Ao executar, o programa exibe um menu (implementado em ListaNomes) para interagir com a lista de nomes — adicionar, remover, listar e operações relacionadas (conforme implementado em MetodosLista).
Contribuição

Enviar issues para bugs ou sugestões.
Para PRs: fork → branch com mudança → pull request descrevendo a alteração.
