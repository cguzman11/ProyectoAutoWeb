package com.ui.run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.net.MalformedURLException;

//features hace referencia a la carpeta features
//glue referencia los pasos de gherkins
//tags referencia los tags con @
//plugin  para los reportes


@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/LineasDeCredito/ADC3237_Disposicin-de-lineas-paralelas.feature"},
        glue = { "com.mibanco.ui.steps" },
        tags = { "~@ignore" },
        plugin = {"json:target/cucumber-reports/Cucumber.json" },
        monochrome = true)
public class RunCukeTest {
/*

    static BaseAppium ba = new BaseAppium();
    @BeforeClass
    public static void iniciarAppium() throws MalformedURLException, Exception {
        ba.initAppium();
        Thread.sleep(15000);
    }

    @AfterClass
    public static void CerrarAppium() {
        ba.endAppium();
    }
*/

}
