package br.edu.univas;

public class Questao10 {

    public static void main(String[] args) {

        String frase = "prova de programação na terça";
        String palavra = "programação";
        boolean temApalavra = false;

        String[] array = frase.split(" ");

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(palavra)) {
                temApalavra = true;
                break;
            } else if (i == array.length-1 && !array[i].equals(palavra)) {
                temApalavra = false;
            }
        }
        System.out.println(temApalavra);
    }
}
