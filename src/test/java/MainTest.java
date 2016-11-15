import org.junit.Test;
import pages.Page;

public class MainTest extends  BeforeTest {

    @Test
    public void testMethod() throws Exception {
        Page.getDriver().get(site);
        testPage = homePage.testURL("epam systems");
        assertPage = testPage.getLinkIdeas();
        assertPage = assertPage.assertTest("Идеи и проекты");
    }
    @Test
    public void testMethodError() throws Exception {
        Page.getDriver().get(site);
        testPage = homePage.testURL("epam systems");
        assertPage = testPage.getLinkIdeas();
        assertPage = assertPage.assertTest("Идеи");
    }
}
