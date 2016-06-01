package fiuba.algo3.tests;

import java.util.ArrayList;
import java.util.List;
import fiuba.algo3.modelo.*;
import org.junit.Assert;
import org.junit.Test;


public class AlgoFormerstest {

	@Test
	public void test01moverAlgoFormer() {
		List<String> movimientos = new ArrayList<String>();
		String nombre1;

		Jugador jugador1 = new Jugador("Nombre1", "Decepticons");
		Jugador jugador2 = new Jugador("Nombre2", "Autobots");

		Partida partida = new Partida(jugador1, jugador2);

		// En el caso que no hubiese ningún AF devuelve:
		// "Casillero vacío"
		nombre1 = partida.obtenerAlgoformer("A1").obtenerNombre();

		// estos movimientos los tomaríamos por los clicks en el tablero
		// Este caso mueve el AlgoF. de A1 a A3. (click en A1, A2 y A3)
		movimientos.add("A1");
		movimientos.add("A2");
		movimientos.add("A3");

		partida.jugar("MOVER", movimientos);

		Assert.assertFalse(nombre1 == partida.obtenerAlgoformer("A1").obtenerNombre());
		Assert.assertFalse(nombre1 == partida.obtenerAlgoformer("A2").obtenerNombre());
		Assert.assertTrue(nombre1 == partida.obtenerAlgoformer("A3").obtenerNombre());
	}
}
