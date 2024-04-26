package javadois;

import java.util.Scanner;

public class ExecDois {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = {1,2,3,4,5,6,7,8,9,10};
		String pares = "", impares = "";
		int soma = 0;
		float media;
		
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] % 2 == 0) {
				pares += vetor[i] + " ";
			} else {
				impares += vetor[i] + " ";
			}
			soma += vetor[i];
		}
		media = soma/vetor.length;
		
		System.out.println("Elementos nos índices ímpares:\n" + impares + "\n\n" + "Elementos nos índices pares:\n" + pares 
				+ "\n\n" + "Soma:\n" + soma + "\n\n" + "Média:\n" + media);
}
}
