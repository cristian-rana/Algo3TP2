package fiuba.algo3.modelo;

import java.util.List;

public class Partida {

	private Tablero tablero;
	private int turno;
	private List<Casillero> casilleros;
	private String resultado;

	
	public Partida(Jugador jug1, Jugador jug2) {
			//inicializa toda la lista de casilleros	
	}
	
	public void jugar(String accion, List<String> mov){
		if (accion == "MOVER") {
			this.mover(mov);
		}
	}
	
	public void mover(List<String> mov){
		mov.get(0);
		
		
	}
	
	public AlgoFormer obtenerAlgoformer(String ubicacion) {
		return this.tablero.contenidoCasillero(ubicacion);
	}

}
	

