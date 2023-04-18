package br.edu.univas;

public class Questao8 {

    public static void main(String[] args) {

        String[] lista = {"abelha","javali","morcego","elefante"};
        String palavrasJuntas = "";

        for (int i = 0; i < lista.length; i++) {
            palavrasJuntas += lista[i];
        }
        System.out.println(palavrasJuntas);
    }
}
