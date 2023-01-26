package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// retorna true/false para a add do elemento
		// em caso de ser uma lista com limite de tamanho
		// e esta estiver cheia, n�o vai apresentar erro
		// no c�digo, com o add exibiria um erro nessa situa��o.
		fila.add("Ana"); // lan�a uma exce��o
		fila.offer("Bia"); // retorna false
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// foreach
		for(String queue: fila) {
			System.out.println(queue);
		}
		// Peek e Element obtem o proximo elemento
		// da fila sem remover
		// Diferen�a de comportamento quando a
		// fila est� vazia
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lan�a uma exce��o
		System.out.println(fila.element());

		// Pool e Remove obtem o proximo elemento
		// da fila e remove!

		// Diferen�a de comportamento quando a
		// fila est� vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // lan�a null
		System.out.println(fila.remove()); // lan�a um exce��o
		
		// fila.size()
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...)
	}
}
