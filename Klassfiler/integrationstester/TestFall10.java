package integrationstest;
import inte.projekt.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFall10 {

	@Test(expected = IllegalArgumentException.class)
	public void testFall10() {
		Vara v = new Vara("L�sgodis", 14, "hg","3456");
		
	}

}
