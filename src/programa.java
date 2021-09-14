/*
União Metropolitana de Educação e Cultura
Bacharelado em Sistemas de Informação
Programação Orientada a Objetos II
Prof. Pablo Ricardo Roxo Silva
Tiago Nogueira Peixoto
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class programa {

    public static void main(String[] args) {
        ArrayList<String> pessoas = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        int op;


        do {
            System.out.println("       -------------------------------------------------------------------");
            System.out.println("        C A D A S T R O   D E    P A R T I C I P A N T E S");
            System.out.println("            1 - CADASTRAR");
            System.out.println("            2 - EXCLUIR POR POSIÇÃO");
            System.out.println("            3 - EXCLUIR POR NOME");
            System.out.println("            4 - EXIBIR TODOS OS PARTICIPANTES");
            System.out.println("            5 - PESQUISAR PARTICIPANTES");
            System.out.println("            6 - ORDENAR LISTA DE PARTICIPANTES ALFABETICAMENTE");
            System.out.println("            7 - LIMPA LISTA PARTICIPANTES");
            System.out.println("            8 - SAIR");
            System.out.println("       -------------------------------------------------------------------");
            op = ler.nextInt();
            ler.nextLine();
            int i;
            String nome;


            switch (op) {
                case 1 -> {
                    System.out.print("Digite o nome do Participante!");
                    pessoas.add(ler.nextLine());
                }
                case 2 -> {
                    System.out.println("Digite a posição a remover!");
                    i = ler.nextInt();
                    pessoas.remove(i);
                }
                case 3 -> {
                    System.out.println("Digite o nome do participante a excluir!");
                    nome = ler.nextLine();
                    if (pessoas.contains(nome)) {
                        pessoas.remove(nome);
                        System.out.println("Usuário Removido!");
                    } else {
                        System.out.println("Usuário  não encontrado!");
                    }
                    System.out.println("Pressione para continuar...");
                    new Scanner(System.in).nextLine();
                }
                case 4 -> {
                    for (i = 0; i < pessoas.size(); i++) {
                        System.out.println(pessoas.get(i));
                    }
                    System.out.println("Pressione para continuar...");
                    new Scanner(System.in).nextLine();
                }
                case 5 -> {
                    System.out.println("Digite o nome do participante a pesquisar!");
                    nome = (ler.nextLine());
                    if (pessoas.contains(nome)) {
                        System.out.println("Usuário Cadastrado!");
                    } else {
                        System.out.println("Usuário  não Cadastrado!");
                    }
                }
                case 6 -> {
                    Collections.sort(pessoas);
                    System.out.println(pessoas);
                }
                case 7 -> pessoas.clear();
                case 8 -> System.out.println(" Obrigado");
                default -> {
                    System.out.println("       -------------------------------------------------------------------");
                    System.out.println("       Opção Inválida !");
                    System.out.println("       -------------------------------------------------------------------");
                }
            }
        } while (op!=8);

    }
}
