package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();

		// retorna true/false para a add do elemento
		// em caso de ser uma lista com limite de tamanho
		// e esta estiver cheia, não vai apresentar erro
		// no código, com o add exibiria um erro nessa situação.
		fila.add("Ana"); // lança uma exceção
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
		// Diferença de comportamento quando a
		// fila está vazia
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lança uma exceção
		System.out.println(fila.element());

		// Pool e Remove obtem o proximo elemento
		// da fila e remove!

		// Diferença de comportamento quando a
		// fila está vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // lança null
		System.out.println(fila.remove()); // lança um exceção
		
		// fila.size()
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...)
	}
}
