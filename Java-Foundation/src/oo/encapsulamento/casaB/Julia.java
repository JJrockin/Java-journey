package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();
	
	void testeAcessos() {
		// n�o acesso protected
//		System.out.println(sogra.segredo);
		// n�o tem acesso default
//		System.out.println(sogra.facoDentroDeCasa);
		// n�o tem acesso protected
//		System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
	}
}
