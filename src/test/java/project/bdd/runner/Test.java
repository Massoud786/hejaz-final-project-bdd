package project.bdd.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "project.bdd.steps",
        //tags = "@AccountsTest_2",
        dryRun = false
)
public class Test {
}
