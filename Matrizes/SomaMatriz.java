package Matrizes;

import java.util.Scanner;

public class SomaMatriz {

	public static void main(String[] args) {
		
		int i, j, somaPrincipal=0, somaSecundaria=0;
		int [][] matriz = new int [3][3];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sistema para mostrar Elementos de uma Matrix 3x3 e somar suas Diagonais"
				+ "\n***********************************************************************"
				+ "\nVamos começar inserindo os elementos da Matriz!\n");
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				System.out.print("Digite o elemento da posição: " + (i+1) + "-" + (j+1) + ": ");
				matriz[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("***********************************************************************\nMatriz inserida:\n");
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n***********************************************************************\nOs elementos da Diagonal Principal são:");
		for(i = 0; i < 3; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println("\n\nOs elementos da Diagonal Secundária são:");
		for(i = 0; i < 3; i++) {
			System.out.print(matriz[i][2-i] + " ");
		}
		
		System.out.println("\n\n***********************************************************************\nAgora, vamos verificar as somas das Diagonais da Matriz!");
		for(i=0; i < 3; i++) {
			somaPrincipal += matriz[i][i];
			somaSecundaria += matriz [i][2-i];
		}
		
		System.out.println("\nA soma da Diagonal Principal é: " + somaPrincipal + "!");
		System.out.println("\nA soma da Diagonal Secundária é: " + somaSecundaria + "!");
	}

}
