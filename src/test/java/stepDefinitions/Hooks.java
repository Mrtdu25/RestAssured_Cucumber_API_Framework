package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import utility.ConfigurationReader;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;

public class Hooks {
//    @BeforeAll
//    public static void setUp(){
//        baseURI = ConfigurationReader.getProperty("library.baseURI");
//        basePath = ConfigurationReader.getProperty("library.basePath");
//    }
//
//    @AfterAll
//    public static void tearDown(){
//        reset();
//    }

    @Before
    public void setup(Scenario scenario) {
        baseURI = ConfigurationReader.getProperty("library.baseURI");
//        basePath = ConfigurationReader.getProperty("library.basePath");
    }


    @After
    public void tearDown(Scenario scenario) {
        reset();
    }

}
