package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class AlgoFormer {
	
	private String nombre;
	private int puntosDeVida;
	private int ataque;
	private int distAtaque;
	private int velocidad;
	private List<Modo> modos;
	

	public AlgoFormer() {
				
	}
	
	public boolean ataqueValido() {
		return false;
	}
	
	public boolean movimientoValido() {
		return false;
	}
	
	public String obtenerNombre() {
		return this.nombre;
	}

	



}

