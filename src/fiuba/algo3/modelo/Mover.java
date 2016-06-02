package fiuba.algo3.modelo;

import java.util.List;

import javax.swing.*;

/**
 * Created by Julian Garate on 6/1/16.
 */
public class Mover implements Accion {

	private List<Coordenada> movimiento;
	
    public Mover(List<Coordenada> movimiento) {
    	// TODO Ver si hace falta clonar la lista o alcanza con
    	// guardarse una referencia
    	this.movimiento = movimiento;
    }

	@Override
	public void ejecutarSobre(Partida partida, Tablero tablero) {
    	if (movimiento == null || movimiento.size() < 2) {
    		throw new MovimientoInvalidoException();
    	}
		Coordenada origen = movimiento.remove(0);
		Coordenada destino = movimiento.remove(movimiento.size() - 1);
		System.out.println(origen);
		AlgoFormer personaje = tablero.algoFormerEnCasillero(origen);
		for (Coordenada coordenada : movimiento) {
			tablero.atravesarCasillero(coordenada, personaje);
		}
		tablero.atravesarCasillero(destino, personaje);
		tablero.ponerAlgoformer(personaje, destino);
		tablero.sacarElemento(personaje, origen);
	}
}
