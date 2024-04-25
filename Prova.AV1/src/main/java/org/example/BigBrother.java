package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BigBrother {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> bigBrother = new ArrayList<String>();

        bigBrother.add("Alane Dias");
        bigBrother.add("Beatriz Reis");
        bigBrother.add("Davi Brito");
        bigBrother.add("Deniziane Ferreira");
        bigBrother.add("Fernanda Bande");
        bigBrother.add("Giovanna Pitel");
        bigBrother.add("Giovanna Lima");
        bigBrother.add("Isabelle Nogueira");
        bigBrother.add("Juninho");
        bigBrother.add("Leidy Elin");
        bigBrother.add("Lucas Henrique");
        bigBrother.add("Lucas Luigi");
        bigBrother.add("Lucas Pizane");
        bigBrother.add("Marcos Vinicius");
        bigBrother.add("Matteus Amaral");
        bigBrother.add("Maycon Cosmer");
        bigBrother.add("MC Bin Laden");
        bigBrother.add("Michel Nogueira");
        bigBrother.add("Nizam");
        bigBrother.add("Raquele Cardozo");
        bigBrother.add("Rodriguinho");
        bigBrother.add("Thalyta Alves");
        bigBrother.add("Vanessa Lopes");
        bigBrother.add("Vinicius Rodrigues");
        bigBrother.add("Wanessa Carmago");
        bigBrother.add("Yasmin Brunet");

        Map<String, Integer> votos = new HashMap<>();


        for (String nome : bigBrother) {
            votos.put(nome, 0);
        }

        System.out.println("Bem-vindo ao Big Brother!");
        System.out.println("Em quem você vota para sair da casa? (ou 'sair' para encerrar):");

        String voto = ler.nextLine();
        while (!voto.equalsIgnoreCase("sair")) {
            if (bigBrother.contains(voto)) {
                votos.put(voto, votos.get(voto) + 1);
                System.out.println("Voto registrado com sucesso para " + voto);
            } else {
                System.out.println("Participante não encontrado. Por favor, digite o nome corretamente.");
            }
            System.out.println("Digite o próximo voto (ou 'sair' para encerrar):");
            voto = ler.nextLine();
        }

        System.out.println("Resultados da votação:");
        for (String nome : bigBrother) {
            int quantidadeVotos = votos.get(nome);
            System.out.println(nome + ": " + quantidadeVotos + " votos");
        }
    }
}