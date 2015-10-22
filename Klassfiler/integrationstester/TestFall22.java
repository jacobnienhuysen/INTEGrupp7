package integrationstest;
import inte.projekt.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFall22 {

	@Test(expected = IllegalArgumentException.class)
	public void testFall22() {
		Kvitto kvitto = new Kvitto(987, null);
	}

}
