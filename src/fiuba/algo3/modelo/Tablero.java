package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tablero {
	
	private int largoX;
	private int largoY;
	private List<Casillero> casilleros;

	public Tablero(int largoX, int largoY) {
		this.largoX = largoX;
		this.largoY = largoY;
		casilleros = new ArrayList<Casillero>(largoX * largoY);
		for (int i = 1; i <= largoX; ++i) {
			for (int j = 1; j <= largoX; ++j) {
				casilleros.add(new Casillero(new Coordenada(i, j)));
			}
		}
	}

	public AlgoFormer algoFormerEnCasillero(Coordenada ubicacion) {
		return localizarCasillero(ubicacion).obtenerAlgoformer();
	}

	public boolean casilleroVacio(Coordenada ubicacion) {
		return localizarCasillero(ubicacion).estaVacio();
	}

	private Casillero localizarCasillero(Coordenada ubicacion) {
		for (Casillero casillero: casilleros) {
			if (casillero.estaEnPosicion(ubicacion)) {
				return casillero;
			}
		}
		throw new PosicionInvalidaException();

	}

	// TODO Tal vez esto tendria que tomar un contenido cualquiera, no un personaje
	public void ponerAlgoformer(AlgoFormer personaje, Coordenada ubicacion) {
		localizarCasillero(ubicacion).ponerAlgoformer(personaje);
	}
    public void ponerChispaSuprema( ChispaSuprema chispaSuprema, Coordenada ubicacion) {
        localizarCasillero(ubicacion).ponerContenido(chispaSuprema);
    }

	// TODO Por ahora solamente se saca el algoformer. Habria que ver que pasa
	// en el caso de los bonus, etc... O los saca al "atravesar"?
	public void sacarElemento(Contenido elemento, Coordenada ubicacion) {
		localizarCasillero(ubicacion).sacarAlgoformer();
	}

	public void atravesarCasillero(Coordenada coordenada, AlgoFormer personaje) {
		// TODO Validar que el casillero se pueda atravesar
		// TODO Hacer que la superficie actue sobre el personaje
		// TODO Obtener los bonificadores del camino?
		// TODO Obtener la chispa?
	}

	public Contenido contenidoEnCasillero(Coordenada ubicacion) {
		return(localizarCasillero(ubicacion).obtenerContenido());
	}
}

