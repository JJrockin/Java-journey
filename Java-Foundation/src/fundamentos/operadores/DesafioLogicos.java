package fundamentos.operadores;

public class DesafioLogicos {
	// Trabalho na ter�a (V ou F)
	// Trabalho na quinta (V ou F)
	// Se T1 e T2 (V) TV 50" buy e ir shopping
	// Se T1 ou T2 (V) TV 32" buy e ir shopping
	// Qualquer TV comprada = tomar sorvete no shopping
	// Se T1 e T2 (F) fam�lia em casa sem sorvete
	// Sem sorvete = mais saud�vel
	// resultado print dizendo qual TV foi comprada e se saudavel
	// Quais operadores mapeiam cada situa��o?
	
	public static void main(String[] args) {
		
		boolean T1 = true;
		boolean T2 = false;
		
		boolean T50 = T1 && T2;
		boolean T32 = T1 ^ T2;
				
		boolean compraTV = T1 || T2;
		boolean sorvete = T1 || T2;
		
		boolean saudavel = !sorvete;
		
		System.out.println("Comprei TV?\n" + compraTV);
		System.out.println("Fomos saud�veis?\n" + saudavel);
		System.out.println("Qual TV compramos?\n" + "50\"?\n" + T50 + "\n32\"?\n" + T32);
		// uso da \ indica pro programa usar o s�mbolo que vier depois 
		// de forma literal, ou seja, usar as aspas como um string or sorts
		// que indicar� polegadas
		
	}

}
