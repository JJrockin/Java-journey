package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.67;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " + sobrenome +
				"\nIdade: " + idade + "\nSal�rio: " + salario +"\n\n";
		System.out.println(maisUmaFrase);
		
		System.out.printf("O sr. %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO sr. %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase Qualquer".contains("Qual"));
		System.out.println("Frase qualquer".indexOf("qual")); // onde come�a o "qual"
		System.out.println("Frase qualquer".substring(6)); // do 6 ao final
		System.out.println("Frase qualquer".substring(6,10)); // vai do 6 ao 9 char, o 10 n�o entra
		
	}
}
