package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Informações do Funcionario
		
		// Tipos numéricos
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_485_233L; // uso o "L" para indicar que é um long e não um inteiro literal
		
		// Tipos numéricos reais
		float salario = 11_445.44F; // aqui usamos "F" para indicar um float
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		
		// Tipo Caractere
		char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		// Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: "+ status);
	}
}
