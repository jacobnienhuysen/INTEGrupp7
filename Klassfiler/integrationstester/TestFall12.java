package integrationstest;
import inte.projekt.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFall12 {

	@Test(expected = IllegalArgumentException.class)
	public void test() {
		Vara v = new Vara("Lösgodis", 14, "hg", "345678BA12345");
	}

}
