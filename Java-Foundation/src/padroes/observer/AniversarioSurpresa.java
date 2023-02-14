package padroes.observer;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		Namorada sofia = new Namorada();
		Porteiro seuJorge = new Porteiro();
		
		seuJorge.registrarObservador(sofia);
		
		// usando uma Lambda function
		seuJorge.registrarObservador(evento -> {
			System.out.println("Surpresa via Lambda!");
			System.out.println("Ocorreu em: " + evento.getMomento());
		});
		
		seuJorge.monitorar();
		
	}

}
