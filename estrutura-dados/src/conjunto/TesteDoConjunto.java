package conjunto;

import java.util.HashSet;
import java.util.Set;

public class TesteDoConjunto {

	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Pedro");
		System.out.println(conjunto);
		
		conjunto.adiciona("Patricia");
		System.out.println(conjunto);
		
		conjunto.adiciona("Guilherme");
		System.out.println(conjunto);
		
		conjunto.remove("Pedro");
		System.out.println(conjunto);
		
		Set<String> conjuntoDoJava = new HashSet<String>();
		conjuntoDoJava.add("Luana");
		conjuntoDoJava.add("Daiane");
		
		System.out.println(conjuntoDoJava);
	}
}
