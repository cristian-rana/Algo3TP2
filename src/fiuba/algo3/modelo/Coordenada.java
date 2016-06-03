package fiuba.algo3.modelo;

public class Coordenada {
	private int x;
	private int y;

	public Coordenada(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object otroObjeto) {
		try {
			Coordenada otraCoordenada = (Coordenada) otroObjeto;
			return this.x == otraCoordenada.x && this.y == otraCoordenada.y;
		} catch (ClassCastException cce) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
