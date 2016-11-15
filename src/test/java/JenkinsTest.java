import org.junit.Test;
import pages.Page;

public class JenkinsTest extends BeforeTest{
    @Test
    public void signInTest() throws Exception {
        Page.getDriver().get(site);
        testPage = homePage.testURL("epam systems");
        assertPage = testPage.getLinkIdeas();
        assertPage = assertPage.assertTest("Ideas");
    }
    @Test
    public void signInTestErr() throws Exception {
        Page.getDriver().get(site);
        testPage = homePage.testURL("EPAM | Software Product Development Services");
        assertPage = testPage.getLinkIdeas();
        assertPage = assertPage.assertTest("Ideasdsfsfs");
    }
}
