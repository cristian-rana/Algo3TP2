
package fiuba.algo3.tests;



import fiuba.algo3.modelo.Optimus;
import org.junit.Test;

import org.junit.Assert;

public class AlgoFormerTest {

	@Test
	public void test01EmpiezaEnModoHumanoide() {
		Optimus optimus = new Optimus();
		Assert.assertEquals(optimus.getAvatar(), "Optimus Humanoide");
	}

	@Test
	public void test02TransformarAModoAlterno() {
	    Optimus optimus = new Optimus();

		Assert.assertEquals(optimus.getAvatar(), "Optimus Humanoide");
		optimus.cambiarModo();
		Assert.assertEquals(optimus.getAvatar(), "Peterbilt 379");
	}

	@Test
	public void test03TransformarDeVueltaAHumanoide() {

        Optimus optimus = new Optimus();

		Assert.assertEquals(optimus.getAvatar(), "Optimus Humanoide");
		optimus.cambiarModo();
		Assert.assertEquals(optimus.getAvatar(), "Peterbilt 379");
		optimus.cambiarModo();
		Assert.assertEquals(optimus.getAvatar(), "Optimus Humanoide");
	}
}
