package integrationstest;
import inte.projekt.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFall20 {

	@Test(expected = IllegalArgumentException.class)
	public void testFall20() {
		Rabatter rabatt = new Rabatter("Pensionär", -10);
	}

}
