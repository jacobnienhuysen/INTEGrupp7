package integrationstest;
import inte.projekt.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFall8 {

	@Test(expected = IllegalArgumentException.class)
	public void testFall8() {
		Vara v = new Vara("grillkol", 16, "ml", "9876543210987");
	}

}
