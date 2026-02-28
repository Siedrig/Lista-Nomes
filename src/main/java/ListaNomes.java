import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaNomes implements MetodosLista {
    private ArrayList<String> nomes;
    private Scanner sc;

    public ListaNomes() {
        nomes = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    @Override
    public void menu() {
        boolean executando = true;
        while (executando) {
            System.out.println("""
                    ===== Lista de Nomes =====
                    Escolha uma opção:
                    1 - Inserir
                    2 - Deletar
                    3 - Mostrar desordenado
                    4 - Mostrar ordenado
                    5 - Sair
                    """);
            int opcao = sc.nextInt();
            sc.nextLine(); // Consome a quebra de linha
            switch (opcao) {
                case 1 -> inserir();
                case 2 -> apagar();
                case 3 -> listaDes();
                case 4 -> listaOrd();
                case 5 -> {
                    System.out.println("Finalizando algoritmo");
                    executando = false;
                }
                default -> System.out.println("Opção inválida, escolha uma existente.");
            }
            System.out.println();
        }
        sc.close();

    }

    @Override
    public void inserir() {
        System.out.println("Digite um nome para inserir (ou deixe em branco para retornar ao menu):");
        String nome = sc.nextLine();
        if (nome.isEmpty()) {
            System.out.println("Nenhum nome inserido. Voltando ao menu.");
        } else {
            nomes.add(nome);
            System.out.println("Nome inserido com sucesso!");
        }

    }

    @Override
    public void apagar() {
        if (nomes.isEmpty()) {
            System.out.println("A lista está vazia. Nada para deletar.");
            return;
        }

        // Mostra a lista com índices para facilitar a escolha do usuário
        System.out.println("Lista de nomes:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i + " - " + nomes.get(i));
        }
        System.out.println("Digite o índice do nome a ser removido:");
        int idx = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha
        if (idx < 0 || idx >= nomes.size()) {
            System.out.println("Índice inválido.");
        } else {
            String removido = nomes.remove(idx);
            System.out.println("Nome removido: " + removido);
        }

    }

    @Override
    public void listaDes() {
        if (nomes.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("Lista sem ordenação:");
            for (String nome : nomes) {
                System.out.println(nome);
            }
        }

    }

    @Override
    public void listaOrd() {
        if (nomes.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            // Cria uma cópia da lista para não alterar a ordem original
            ArrayList<String> ordenada = new ArrayList<>(nomes);
            Collections.sort(ordenada);
            System.out.println("Lista ordenada:");
            for (String nome : ordenada) {
                System.out.println(nome);
            }
        }
    }

}

