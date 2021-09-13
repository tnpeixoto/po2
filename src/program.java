/*
União Metropolitana de Educação e Cultura
Bacharelado em Sistemas de Informação
Programação Orientada a Objetos II
Prof. Pablo Ricardo Roxo Silva
Tiago Nogueira Peixoto
*/

import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        double av1, av2, av3, media;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a nota da primeira avaliação");
        av1 = ler.nextDouble();
        System.out.println("Digite a nota da segunda avaliação");
        av2 = ler.nextDouble();
        System.out.println("Digite a nota da primeira avaliação");
        av3 = ler.nextDouble();
        media = (av1 + av2 + av3)/3;
        System.out.println("Sua média foi: " + media);


        if (media<4){
            System.out.println("Você foi conservado !");
        } else if (media>=4 && media<7){
            System.out.println("Você está na recuperação !");
        } else {
            System.out.println("Parabéns, você foi aprovado !");
        }


    }
}
