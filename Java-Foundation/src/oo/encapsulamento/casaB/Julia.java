package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();
	
	void testeAcessos() {
		// não acesso protected
//		System.out.println(sogra.segredo);
		// não tem acesso default
//		System.out.println(sogra.facoDentroDeCasa);
		// não tem acesso protected
//		System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
	}
}
