package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;

public class HomePage extends  Page {

	@FindBy(id="lst-ib")
	private WebElement search;

    @FindBy(xpath="//a[@href='https://www.epam.com/']")
    private WebElement getSiteEpam;





    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public TestPage testURL( String string) throws AWTException, InterruptedException {

        search.sendKeys(string);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_ENTER);
        getSiteEpam.click();
        return  new TestPage(driver.get());

    }
}
