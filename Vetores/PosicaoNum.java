package Vetores;

import java.util.Scanner;

public class PosicaoNum {

	public static void main(String[] args) {
		
		int num, i;
		int vetor[] = new int[10];
		boolean achou = false;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Sistema para verificar a Posição de um número\n*********************************************************");
		
		for(i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i+1) + "° número: ");
			vetor[i] = scan.nextInt();
		}
		
		System.out.println("Números que você digitou:");
		for(i = 0; i < 10; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		System.out.print("\n\nAgora, digite o núemro que deseja saber em que posição está: ");
		num = scan.nextInt();
		
		for(i = 0; i < vetor.length; i++) {
			if(vetor[i] == num) {
				System.out.println("\nO número " + num + " está localizado na posição: "  + i + "!");
				achou = true;
				break;
			}
		}
		
		if(!achou) {
			System.out.println("\nO número " + num + " não foi encontrado!!");
		}
	}

}
