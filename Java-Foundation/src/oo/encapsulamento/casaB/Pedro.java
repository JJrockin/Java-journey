package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	// filho da Ana
	// tem acesso a dados da Ana por heran�a
	// n�o por composi��o (nota��o .)
	
	void testeAcessos() {
		// n�o acesso protected
//		System.out.println(segredo);
		// est� em package diferente, sem acesso default
//		System.out.println(facoDentroDeCasa);
		// herda protected e acessa diretamente
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		//ou para acessar public pode usar composi��o
		System.out.println(new Ana().todosSabem);
	}

}
