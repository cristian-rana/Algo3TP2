package fiuba.algo3.tests;

import fiuba.algo3.modelo.AlgoFormer;
import fiuba.algo3.modelo.Modo;
import org.junit.Test;

import org.junit.Assert;

public class AlgoFormerTest {

	@Test
	public void test01EmpiezaEnModoHumanoide() {
		Modo optimusHumanoide = new Modo("Optimus Humanoide", 50, 2, 2);
		Modo optimusAlterno = new Modo("Peterbilt 379", 15, 4, 5);
		AlgoFormer optimus = new AlgoFormer("Optimus", 500, optimusHumanoide, optimusAlterno);

		Assert.assertEquals(optimus.getAvatar(), "Optimus Humanoide");
	}

	@Test
	public void test02TransformarAModoAlterno() {
		Modo optimusHumanoide = new Modo("Optimus Humanoide", 50, 2, 2);
		Modo optimusAlterno = new Modo("Peterbilt 379", 15, 4, 5);
		AlgoFormer optimus = new AlgoFormer("Optimus", 500, optimusHumanoide, optimusAlterno);

		Assert.assertEquals(optimus.getAvatar(), "Optimus Humanoide");
		optimus.cambiarModo();
		Assert.assertEquals(optimus.getAvatar(), "Peterbilt 379");
	}

	@Test
	public void test03TransformarDeVueltaAHumanoide() {
		Modo optimusHumanoide = new Modo("Optimus Humanoide", 50, 2, 2);
		Modo optimusAlterno = new Modo("Peterbilt 379", 15, 4, 5);
		AlgoFormer optimus = new AlgoFormer("Optimus", 500, optimusHumanoide, optimusAlterno);

		Assert.assertEquals(optimus.getAvatar(), "Optimus Humanoide");
		optimus.cambiarModo();
		Assert.assertEquals(optimus.getAvatar(), "Peterbilt 379");
		optimus.cambiarModo();
		Assert.assertEquals(optimus.getAvatar(), "Optimus Humanoide");
	}
}
