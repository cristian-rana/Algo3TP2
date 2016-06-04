package fiuba.algo3.modelo;

public class Casillero {
	
	private Coordenada posicion;
	private AlgoFormer algoformer;
	private Contenido contenido;
		
	public Casillero(Coordenada posicion) {
		this.posicion = posicion;
		this.algoformer = null;
	}
	
	// TODO ver como usar esto en lugar de cada metodo por separado
    public void ponerContenido(Contenido unContenido) {
        if (this.contenido != null) {
            throw new CasilleroOcupadoException();
        }
        this.contenido = unContenido;
    }

	public void ponerAlgoformer(AlgoFormer personaje) {
		if (this.algoformer != null) {
			throw new CasilleroOcupadoException();
		}
		this.algoformer = personaje;
	}
	
	public AlgoFormer obtenerAlgoformer() {
		if (this.algoformer == null) {
			throw new CasilleroVacioException();
		}
		return this.algoformer;
	}
	
	public void sacarAlgoformer() {
		if (this.algoformer == null) {
			throw new CasilleroVacioException();
		}
		this.algoformer = null;
	}

	public boolean estaEnPosicion(Coordenada posicion) {
		return this.posicion.equals(posicion);
	}
	
	public boolean estaVacio() {
		// TODO Eventualmente podria contemplar que este la chispa o haya
		// un bonus
		return this.algoformer == null;
	}

	public Contenido obtenerContenido() {
		if (this.contenido == null) {
			throw new CasilleroVacioException();
		}
		return this.contenido;
	}
}
