package one.digitalinnovation;

public class Main {

	public static void main(String[] args) {
		Fila minhaFila = new Fila();
		minhaFila.enqueue(new No("Primeiro"));
		minhaFila.enqueue(new No("Segundo"));
		minhaFila.enqueue(new No("Terceiro"));
		minhaFila.enqueue(new No("Quarto"));
		
		//Imprimindo o primeiro elemento da fila
		System.out.println(minhaFila.first());
		
		//Imprimindo a fila
		System.out.println(minhaFila);
		
		//Removendo o primeiro elemento da fila e removendo-o da fila
		System.out.println(minhaFila.dequeue());
		
		//Adicionando mais um elemento a fila
		minhaFila.enqueue(new No("Último"));
		
		//Imprimindo a fila novamente
		System.out.println(minhaFila);

	}

}
