package fiuba.algo3.modelo;

public class Casillero {
	
	private String ubicacion;
	private AlgoFormer algoformer;
	
	public Casillero() {
		
	}

	public AlgoFormer obtenerAlgoformer() {
		return this.algoformer;
	}

	public String obtenerUbicacion() {
		return this.ubicacion;
	}
}
