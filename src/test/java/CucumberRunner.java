import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty", "html:target/cucumber-html-report.html"},
        features={"src/test/Features/"},
        tags = "@EleAttr or @LocatorLinks"
        //glue = {"."}
)
public class CucumberRunner {


}
