package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.DriverManager;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("Setting up test...");
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
        System.out.println("Test cleanup completed");
    }
}