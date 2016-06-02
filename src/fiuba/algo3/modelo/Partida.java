package fiuba.algo3.modelo;

public class Partida {

	private Tablero tablero;
	Jugador jugador1;
	Jugador jugador2;
	Jugador jugadorTurnoActual;
	Jugador jugadorEsperando;
	private boolean jugando;
	
	public Partida(Jugador jug1, Jugador jug2) {
		this.jugador1 = jug1;
		this.jugador2 = jug2;
		//TODO sacar hardcode del tamanio del tablero. Discutir como vamos
		// a inicializar los mapas.
		this.tablero = new Tablero(10, 10);
		// TODO inicializar todo el equipo
		Modo optimusHumanoide = new Modo("Optimus Humanoide", 50, 2, 2);
		Modo optimusAlterno = new Modo("Peterbilt 379", 15, 4, 5);
		AlgoFormer optimus = new AlgoFormer("Optimus", 500, optimusHumanoide, optimusAlterno);
		tablero.ponerAlgoformer(optimus, new Coordenada(1,1));
		this.jugando = true;
	}
	
	public void jugar(Accion accion) {
		if (!jugando) {
			throw new JuegoNoEstaActivoException();
		}
		accion.ejecutarSobre(this, this.tablero);
		terminarTurno();
	}
	
	private void terminarTurno(){
		// TODO Validar si termino el partido
		// TODO Notificar a las cosas que duran X turnos
		Jugador temp = jugadorTurnoActual;
		jugadorTurnoActual = jugadorEsperando;
		jugadorEsperando = temp;
	}
	
	public String obtenerAlgoformer(Coordenada ubicacion) {
		return this.tablero.algoFormerEnCasillero(ubicacion).getNombre();
	}

	public boolean casilleroVacio(Coordenada ubicacion) {
		return this.tablero.casilleroVacio(ubicacion);
	}

}
	

