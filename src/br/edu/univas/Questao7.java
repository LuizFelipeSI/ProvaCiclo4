package br.edu.univas;

public class Questao7 {

    public static void main(String[] args) {

        int[][] matriz = {{1, 2},{3, 4}};

        if (matriz.length == matriz[0].length) {
            if (matriz.length == 1) {
                System.out.println("não é possível determinar");
            } else if (matriz.length == 2) {
                int principal = 1;
                int secundaria = 1;
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j <matriz[i].length; j++) {
                        if (i == j) {
                            principal *= matriz[i][j];
                        } else if (i+j == matriz.length-1) {
                            secundaria *= matriz[i][j];
                        }
                    }
                }
                System.out.println(principal-secundaria);
            } else {
                System.out.println("não é possível determinar");
            }
        } else {
            System.out.println("não é possível determinar");
        }
    }
}

