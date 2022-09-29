package taudemo;

import browser.BrowserGetter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;


//Test Automation University exercise
@TestInstance(PER_CLASS)

public class SeleniumTest {
    private BrowserGetter browserGetter = new BrowserGetter();
    private WebDriver driver;

    @BeforeAll
    public void beforeAll() {
        driver = browserGetter.getDriver(); //
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void justTest() {
        driver.get("https://example.com");
        assertEquals("Example domain", driver.getTitle());
    }


}


