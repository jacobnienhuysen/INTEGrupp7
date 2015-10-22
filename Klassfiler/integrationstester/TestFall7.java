package integrationstest;
import inte.projekt.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFall7 {

	@Test(expected = IllegalArgumentException.class)
	public void testFall7() {
		Vara v = new Vara("grillkol", 16, "dl", "9876543210987");
		
	}

}
