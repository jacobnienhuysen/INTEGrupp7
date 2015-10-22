package integrationstest;
import inte.projekt.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestFall13 {

	@Test(expected = IllegalArgumentException.class)
	public void test() {
		NyValuta valuta = new NyValuta("nok");
	}

}
