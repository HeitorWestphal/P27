package com.mycompany.p27;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class P27 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        // Leitura dos elementos da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o elemento da posição [" + (i+1) + "," + (j+1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Cálculo da soma dos elementos da primeira coluna
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            soma += matriz[i][0];
        }

        System.out.println("A soma dos elementos da primeira coluna é " + soma);
        
        
    }
}
