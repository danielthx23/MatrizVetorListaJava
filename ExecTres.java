package javadois;


public class ExecTres {

	public static void main(String[] args) {
		int matriz[][] = {{1,2,3}, {3,4,5}, {6,7,8}};
		String principal = "", secundaria = "";
		int soma1 = 0, soma2 = 0;
		
		for(int i = 0; i < 3; i++) {
			principal += matriz[i][i] + " ";
			soma1 += matriz[i][i];
			secundaria += matriz[i][2 - i] + " ";
			soma2 += matriz[i][2 - i];
			System.out.println();
		}
		
		System.out.println("Elementos da Diagonal Principal:\n"
				+ principal + "\n\n"
				+ "Elementos da Diagonal Secundária:\n"
				+ secundaria + "\n\n"
				+ "Soma dos Elementos da Diagonal Principal:\n"
				+ soma1 + "\n\n"
				+ "Soma dos Elementos da Diagonal Secundária::\n"
				+ soma2);
	}

}
