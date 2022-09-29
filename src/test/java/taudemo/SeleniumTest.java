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
        driver = browserGetter.getChromeDriver();
    }

    @AfterAll
    public void afterAll() {
        driver.quit();
    }

    @Test
    public void theComPageCheckTitle() {
        String expectedComTitle = "Example Domain";
        driver.get("https://example.com");
        assertEquals(expectedComTitle, driver.getTitle());
    }
    @Test
    public void theOrgPageCheckTitle() {
        String expectedOrgTitle = "Example Domain";
        driver.get("https://example.org");
        assertEquals(expectedOrgTitle, driver.getTitle());
    }


}


