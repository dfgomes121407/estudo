package testCucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import testCucumber.support.Web;

public class Hooks {

    private static WebDriver navegador = null;

    @Before
    public static void setUp() {

        navegador = Web.getChromeDriver();
    }

    @After
    public void tearDown() {
        navegador.quit();
    }

    public static WebDriver getNavegador() {
        return navegador;
    }
}
