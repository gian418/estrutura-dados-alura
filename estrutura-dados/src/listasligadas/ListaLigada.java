package listasligadas;

public class ListaLigada {
	
	private Celula primeira = null;

	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(elemento, primeira);
	}
	
	public void adiciona(Object elemento) {}
	
	public void adiciona(int posicao, Object elemento) {}
	
	public Object pega(int posicao) {
		return null;
	}
	
	public void remove(int posicao) {}
	
	public int tamanho() {
		return 0;
	}
	
	public boolean contem(Object o) {
		return false;
	}
}