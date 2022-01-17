package one.digitalinnovation;

public class Main {

	public static void main(String[] args) {
		Fila<String> minhaFila = new Fila<>();
		minhaFila.enqueue("Primeiro");
		minhaFila.enqueue("Segundo");
		minhaFila.enqueue("Terceiro");
		minhaFila.enqueue("Quarto");
		
		//Imprimindo o primeiro elemento da fila
		System.out.println(minhaFila.first());
		
		//Imprimindo a fila
		System.out.println(minhaFila);
		
		//Imprimindo o primeiro elemento da fila e removendo-o da fila
		System.out.println(minhaFila.dequeue());
		
		//Adicionando mais um elemento a fila
		minhaFila.enqueue("Último");
		
		//Imprimindo a fila novamente
		System.out.println(minhaFila);
		
		//Imprimindo o primeiro elemento novamente
		System.out.println(minhaFila.first());

	}

}
