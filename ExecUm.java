package javadois;

import java.util.Scanner;

public class ExecUm {
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int vetor[] = {1,2,3,4,5,6,7,8,9};
	int ent, i;
	boolean encontrado = false;
	
	System.out.println("Insira o digito: ");
	ent = leia.nextInt();
	
	for(i=0; i<vetor.length; i++) {
		if(ent == vetor[i]) {
			System.out.println("Encontrado!");
			encontrado = true;
		}
	}

	if(!encontrado) {
	System.out.println("Não encontrado!");
	}
}
}
