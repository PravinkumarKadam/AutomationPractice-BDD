package stepDepinations;

import base.TestContext;
import io.cucumber.java.*;
import lombok.extern.log4j.Log4j2;


@Log4j2
 class HooksStepDefs extends TestContext {

    TestContext testContext;
    Scenario scenario;

    public HooksStepDefs(TestContext testContext){
        this.testContext = testContext;
    }


    @Before
    public void setUp(Scenario scenario){
        this.scenario = scenario;
    }

    @After(order=1)
    public void cleanUp(Scenario scn){
           driver.quit();
    }

    @After(order=2)
    public void afterEachStep(){
       testContext.screenShot.ScreenShotOfFailedScenario(scn);
    }
}
