package br.edu.univas;

public class Questao6 {

    public static void main(String[] args) {

        String palavra = "Luiz Felipe";
        String invertida = "";

        for (int i = palavra.length()-1; i >=0; i--) {
            invertida += palavra.charAt(i);
        }

        System.out.println(palavra);
        System.out.println("palavra invertida: " + invertida);

    }
}
