package integrationstest;
import inte.projekt.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFall11 {

	@Test(expected = IllegalArgumentException.class)
	public void testFall11() {
		Vara v = new Vara("Lösgodis", 14, "hg", "3456789012345123");
	}

}
