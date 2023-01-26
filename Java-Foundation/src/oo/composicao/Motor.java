package oo.composicao;

	public class Motor {
		
		// OneToOne
		final Carro carro;
		boolean ligado = false;
		double fatorInjacao = 1;
		
		// assim um carro tem um motor e um motor tem um carro
		// bidirecional
		Motor (Carro carro) {
			this.carro = carro;
		}
	
		int giros () {
			if(!ligado) {
				return 0;
			}else {
				return (int) Math.round(fatorInjacao*3000);
			}
		}

	}
