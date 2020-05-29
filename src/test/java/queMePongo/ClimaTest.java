package queMePongo;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ClimaTest {
    private Clima clima;


    @Before
    public void init() {
        clima = new Clima();
    }

    @Test
    public void temperaturaBuenosAires() {
        Assert.assertEquals(20.0,clima.getTemperatura(),0);
    }
}
