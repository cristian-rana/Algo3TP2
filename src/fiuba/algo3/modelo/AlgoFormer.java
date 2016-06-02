package fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.List;

public class AlgoFormer {
	
	private String nombre;
	private int puntosDeVida;
	private Modo modoActivo;
	private Modo modoInactivo;

	public AlgoFormer(String nombre, int puntosDeVida, Modo modoHumanoide, Modo modoAlterno) {
		this.nombre = nombre;
		this.puntosDeVida = puntosDeVida;
		this.modoActivo = modoHumanoide;
		this.modoInactivo = modoAlterno;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getAvatar() {
		return modoActivo.getAvatar();
	}

	public int getPuntosDeVida() {
		return puntosDeVida;
	}
	
	public int getPtosDeAtaque() {
		return modoActivo.getAtaque();
	}
	
	public int getDistanciaAtaque() {
		return modoActivo.getDistAtaque();
	}
	
	public int getVelocidad() {
		return modoActivo.getVelocidad();
	}
	
	public void cambiarModo() {
		Modo tmp = modoActivo;
		modoActivo = modoInactivo;
		modoInactivo = tmp;
	}
	
	public boolean estaVivo() {
		return puntosDeVida > 0;
	}
}

