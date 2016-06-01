package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
	
	private List<Casillero> casilleros;

	public Tablero() {
		
	}

	public AlgoFormer contenidoCasillero(String ubicacion) {
		
		for (Casillero casillero: casilleros) {
			if (casillero.obtenerUbicacion() == ubicacion) {
			return casillero.obtenerAlgoformer();
			}
		}	
		return null;
	}


}

