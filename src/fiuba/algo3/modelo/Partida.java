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

		tablero.ponerAlgoformer(new Optimus(), new Coordenada(1,1));
        tablero.ponerAlgoformer(new Bumblebee(), new Coordenada(3,1));
        tablero.ponerAlgoformer(new Ratchet(), new Coordenada(1,3));
        tablero.ponerAlgoformer(new Megatron(), new Coordenada(10,10));
        tablero.ponerAlgoformer(new Bonecrusher(), new Coordenada(10,8));
        tablero.ponerAlgoformer(new Frenzy(),new Coordenada(8,10));

        tablero.ponerChispaSuprema(new ChispaSuprema(),new Coordenada(6,5));

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

	public String obtenerContenido(Coordenada ubicacion) {
		return this.tablero.contenidoEnCasillero(ubicacion).getNombre();
	}
	public String obtenerModoAlgoformer(Coordenada ubicacion) {
		return this.tablero.algoFormerEnCasillero(ubicacion).getAvatar();
	}

	public boolean casilleroVacio(Coordenada ubicacion) {
		return this.tablero.casilleroVacio(ubicacion);
	}

	public int obtenerVidaAlgoFormer(Coordenada ubicacion) {
		return this.tablero.algoFormerEnCasillero(ubicacion).getPuntosDeVida();		
	}

}
	

