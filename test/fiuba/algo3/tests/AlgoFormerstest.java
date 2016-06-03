package fiuba.algo3.tests;

import java.util.ArrayList;
import java.util.List;

import fiuba.algo3.modelo.*;


import org.junit.Assert;
import org.junit.Test;

/*
Jugabilidad

Hay 2 jugadores, cada uno debe elegir un equipo antes de iniciar una partida.
Cada jugador comienza la partida con sus 3 algoformers.
Es un juego por turnos. En cada turno el jugador debe elegir UN algoformer y solicitarle que realice una actividad
(moverse, transformarse, atacar, combinarse, capturar chispa, etc…).
Luego pasará el turno al contrincante y así sucesivamente hasta la captura de la chispa suprema.
El juego elige al azar qué jugador comienza.
Cada jugador inicia en el extremo opuesto al otro con sus 3 algoformers juntos.

TODOS LOS SUPUESTOS SON VARIABLES

SUPONGO:
1 - Cuando se crea al AF, se crea en modo HUMANOIDE.
2 - El MAPA deberia ser cuadrado y tener una dimesion tal que la Matriz que
    represente al tablero tenga una Casilla centro.
3 - Cambie el ObtenerAlgoformer por ObtenerContenido, pensando que puede tener
    la chispa suprema el casillero.
4 - En vez de pasarle al Algoformer toda la informacion propia, hay Objetos personajes que
    ya tienen esos datos hardcodeados.
    antes -> Algoformer(vida,velocidad, ...., etc)
    ahora -> Algoformer(Optimus)
*/


public class AlgoFormerstest {

	@Test
	public void test01moverAlgoFormer() {

		List<Coordenada> movimiento = new ArrayList<Coordenada>();
		Coordenada coordenada0 = new Coordenada(1,1);
		Coordenada coordenada1 = new Coordenada(1,2);
		Coordenada coordenada2 = new Coordenada(1,3);
		Coordenada coordenada3 = new Coordenada(1,4);
		movimiento.add(coordenada0);
		movimiento.add(coordenada1);
        movimiento.add(coordenada2);
        movimiento.add(coordenada3);

        // TODO
//		Jugador jugador1 = new Jugador("Nombre1", Decepticons);
//		Jugador jugador2 = new Jugador("Nombre2", Autobots);

		Jugador jugador1 = new Jugador("Nombre1");
		Jugador jugador2 = new Jugador("Nombre2");

		// TODO Partida va a requerir un refactor para agregarle opciones de configuracion,
		// por ejemplo elegir el mapa
		Partida partida = new Partida(jugador1, jugador2);

		// TODO Agregar hamcrest al classpath
//		Assert.assertThat(partida.obtenerAlgoformer(coordenada0), 
//				IsEqualIgnoringCaseequalToIgnoringCase("Optimus"));
		Assert.assertTrue(partida.obtenerAlgoformer(coordenada0) 
				.equalsIgnoreCase("Optimus"));
        /*
        El como hace el programa para cargar los movimientos y la validacion
        despues lo discutimos.
         */
		Mover muevoAOptimusEnEjeY = new Mover(movimiento);
		partida.jugar(muevoAOptimusEnEjeY);

//		Assert.assertNotEquals(unAlgoFormer,(AlgoFormer)partida.obtenerContenido(coordenada1));
//		Assert.assertNotEquals(unAlgoFormer,(AlgoFormer)partida.obtenerContenido(coordenada2));
//		Assert.assertEquals(unAlgoFormer,(AlgoFormer)partida.obtenerContenido(coordenada3));
		Assert.assertTrue(partida.casilleroVacio(new Coordenada(1,1)));
		Assert.assertTrue(partida.casilleroVacio(new Coordenada(1,2)));
		Assert.assertTrue(partida.casilleroVacio(new Coordenada(1,3)));
		Assert.assertTrue(partida.obtenerAlgoformer(new Coordenada(1,4)) 
				.equalsIgnoreCase("Optimus"));
	}

//	@Test
//	public void test02TransformarAlgoFormerAFormaAlterna() {
//
//
//		Jugador jugador1 = new Jugador("Nombre1", Decepticons);
//		Jugador jugador2 = new Jugador("Nombre2", Autobots);
//
//		Partida partida = new Partida(jugador1, jugador2);
//
//        Coordenada unaCoordenada = new Coordenada(1,1);
//
//		partida.jugar(Transformar, unaCoordenada);
//
//		assertEquals((AlgoFormer)partida.obtenerContenido(unaCoordenada).getAvatar(),Alterno);
//
//        partida.jugar(Transformar,unaCoordenada);
//
//        assertEquals((AlgoFormer)partida.obtenerContenido(unaCoordenada).getAvatar(),Humanoide)
//
//
//	}

//    @Test
//    public void test03moverAlgoFormerAlterno(){
//
//        List<Coordenada> movimiento = new ArrayList<Coordenada>();
//        
//        int unTamanio = 15;
//
//        Coordenada coordenada0 = new Coordenada(1,1);
//        Coordenada coordenada1 = new Coordenada(1,2);
//        Coordenada coordenada2 = new Coordenada(1,3);
//        Coordenada coordenada3 = new Coordenada(1,4);
//
//        movimiento.add(coordenada1);
//        movimiento.add(coordenada2);
//        movimiento.add(coordenada3);
//        
//        Jugador jugador1 = new Jugador("Nombre1", Decepticons);
//        Jugador jugador2 = new Jugador("Nombre2", Autobots);
//
//
//        Partida partida = new Partida(jugador1, jugador2, unTamanio);
//
//        partida.jugar(Transformar, coordenada0);
//
//        AlgoFormer unAlgoFormer = (AlgoFormer) partida.obtenerContenido(coordenada0);
//
//        Assert.assertEquals((AlgoFormer) partida.obtenerContenido(coordenada0).getAvatar,Alterno);
//
//        partida.jugar(Mover, movimiento);
//
//        Assert.assertEquals(unAlgoFormer,(AlgoFormer) partida.obtenerContenido(coordenada3));
//
//    }
//
//    @Test
//    public void test04inicializarJuego() {
//
//        /*
//        Es un test SIMPLE que prueba que al crearse se inicialice la partida correctamente
//        en un MAPA de 15x15.
//         */
//
//        Jugador jugador1 = new Jugador("Nombre1", Decepticons);
//        Jugador jugador2 = new Jugador("Nombre2", Autobots);
//        
//        int unTamanio = 15;
//        
//        Coordenada coordenada0 = new Coordenada(1,1);
//        Coordenada coordenada1 = new Coordenada(2,3);
//        Coordenada coordenada2 = new Coordenada(3,2);
//        Coordenada coordenada3 = new Coordenada(15,15);
//        Coordenada coordenada4 = new Coordenada(14,13);
//        Coordenada coordenada5 = new Coordenada(13,14);
//        Coordenada coordenada6 = new Coordenada(8,8);
//
//        ChispaSuprema unaChispa = new ChispaSuprema();
//
//
//
//        Partida partida = new Partida(jugador1, jugador2, unTamanio);
//
//        AlgoFormer OPTIMUS = new AlgoFormer(Optimus);
//        AlgoFormer BUMBLEBEE = new AlgoFormer(Bumblebee);
//        AlgoFormer RATCHET = new AlgoFormer(Ratchet);
//
//        AlgoFormer MEGATRON = new AlgoFormer(Megatron);
//        AlgoFormer BONECRUSHER = new AlgoFormer(Bonecrusher);
//        AlgoFormer FRENZY = new AlgoFormer(Frenzy);
//
//
//        Assert.assertTrue(partida.CantidadDeTurnos == 0);
//        Assert.assertEquals(unaChispa , (ChispaSuprema) partida.obtenerContenido(coordenada6));
//        Assert.assertEquals(OPTIMUS, (AlgoFormer) partida.obtenerContenido(coordenada0));
//        Assert.assertEquals(BUMBLEBEE, (AlgoFormer) partida.obtenerContenido(coordenada1));
//        Assert.assertEquals(RATCHET, (AlgoFormer) partida.obtenerContenido(coordenada2));
//        Assert.assertEquals(MEGATRON, (AlgoFormer) partida.obtenerContenido(coordenada3));
//        Assert.assertEquals(BONECRUSHER,(AlgoFormer) partida.obtenerContenido(coordenada4));
//        Assert.assertEquals(FRENZY, (AlgoFormer) partida.obtenerContenido(coordenada5));
//
//    }
//
//    @Test
//    public void test05unPosicionamientoYAtaque() {
//
//        List<Coordenada> desdeHasta = new ArrayList<Coordenada>();
//
//        Jugador jugador1 = new Jugador("Nombre1", Decepticons);
//        Jugador jugador2 = new Jugador("Nombre2", Autobots);
//
//        /*
//        En un mapa de 5 pruebo, sobre lo inicializado, ataque valido e invalido.
//         */
//        int unTamanio = 5;
//
//        Partida partida = new Partida(jugador1, jugador2, unTamanio);
//
//
//
//        Coordenada coordenada0 = new Coordenada(1,1);
//        Coordenada coordenada1 = new Coordenada(2,3);
//        Coordenada coordenada2 = new Coordenada(3,2);
//        Coordenada coordenada3 = new Coordenada(5,5);
//        Coordenada coordenada4 = new Coordenada(3,4);
//        Coordenada coordenada5 = new Coordenada(4,3);
//        Coordenada coordenada6 = new Coordenada(3,3);
//
//        desdeHasta.add(coordenada3); //DESDE
//        desdeHasta.add(coordenada0); //HASTA
//
//        AlgoFormer OPTIMUS = new AlgoFormer(Optimus);
//        AlgoFormer FRENZY = new AlgoFormer(Frenzy);
//
//        partida.jugar(Atacar, desdeHasta);
//
//        /*
//        Megatron(5,5) ataca a Optimus(1,1)
//         */
//
//        AssertEquals( ((AlgoFormer) partida.obtenerContenido(coordenada0)).getPuntosDeVida() , OPTIMUS.getPuntosDeVida() );
//        //Tiene que tener la vida completa, dado que el atacante esta muy lejos.
//
//        desdeHasta.clear();
//
//        desdeHasta.add(coordenada1); //DESDE
//        desdeHasta.add(coordenada4); //HASTA
//
//        partida.jugar(Atacar, desdeHasta);
//
//        /*
//        Bumblebee(2,3) ataca a Frenzy(3,4)
//         */
//
//        AssertNotEquals( ((AlgoFormer) partida.obtenerContenido(coordenada4)).getPuntosDeVida() , FRENZY.getPuntosDeVida() );
//        //NO tiene que tener los mismos puntos de vida porque fue atacado con exito.
//
//    }




}
