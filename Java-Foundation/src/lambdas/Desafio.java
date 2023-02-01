package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	
	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoReal = 
				produto -> produto.preco * (1 - produto.desconto);
		
		System.out.println("O preço real é " + 
				precoReal.apply(p));
		
		UnaryOperator<Double> imposto = 
				precoImposto -> precoImposto >= 2500 ? precoImposto*(1.085) 
						: precoImposto;
				
		System.out.println("Preço após imposto: " + precoReal.andThen(imposto)
		.apply(p));
		
		UnaryOperator<Double> frete = 
				precoFinal -> precoFinal >= 3000 ? precoFinal + 100 
						: precoFinal + 50;
				
		System.out.println("Preço após acréscimo de frete: " + precoReal.andThen(imposto)
				.andThen(frete).apply(p));
		
		double valorFinal = precoReal
				.andThen(imposto)
				.andThen(frete)
				.apply(p);
		
		BigDecimal valorAntes = new BigDecimal(valorFinal).setScale(2, RoundingMode.HALF_UP);
		
		double valorArredondado = valorAntes.doubleValue();
		
		System.out.println("Valor arredondado: " + valorArredondado);
		
		Function<Double, String> formatar =
				numero -> {
					String num = Double.toString(numero).replace('.', ',');
					return "R$" + num;
				};
				
		String formatacao = formatar.apply(valorArredondado);
				
		System.out.println("Preço final formatado é: " + formatacao);
				
		// como prof fez para arredondar, tive que acrescentar o replace porque 
		// meu PC coloca ',' automaticamente na String e java não passa String com ',' para Double
//		UnaryOperator<Double> arredondar = 
//				preco -> Double.parseDouble(String.format("%.2f", preco).replace(',', '.'));
//				
//		Function<Double, String> formatacao =
//				preco -> ("R$" + preco).replace('.', ',');
//		
//		String valorFinal = precoReal
//						.andThen(imposto)
//						.andThen(frete)
//						.andThen(arredondar)
//						.andThen(formatacao)
//						.apply(p);
//		
//		System.out.println("Preço final formatado é: " + valorFinal);
//		
		
	}

}
