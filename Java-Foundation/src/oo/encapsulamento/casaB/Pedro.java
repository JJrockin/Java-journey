package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	// filho da Ana
	// tem acesso a dados da Ana por herança
	// não por composição (notação .)
	
	void testeAcessos() {
		// não acesso protected
//		System.out.println(segredo);
		// está em package diferente, sem acesso default
//		System.out.println(facoDentroDeCasa);
		// herda protected e acessa diretamente
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		//ou para acessar public pode usar composição
		System.out.println(new Ana().todosSabem);
	}

}
