package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @After
    public void tearDown(Scenario scenario) {

        final byte[] failedScreenshot = ((TakesScreenshot)

                                        Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        if (scenario.isFailed()) {

            scenario.attach(failedScreenshot, "image/png", "failedScenario" + scenario.getName());
        }

        Driver.closeDriver();
    }
}
