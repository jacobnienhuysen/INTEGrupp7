package integrationstest;
import inte.projekt.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFall21 {

	@Test(expected = IllegalArgumentException.class)
	public void testFall21() {
		Rabatter rabatt = new Rabatter("Pensionär", 110);
	}

}
