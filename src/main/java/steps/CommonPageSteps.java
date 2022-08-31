package steps;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import pages.CommonPage;

public class CommonPageSteps <T> {
    private CommonPage commonPage;
    private CommonPage.LeftMenu leftMenu;

    public CommonPageSteps() {
        this.commonPage = new CommonPage();
    }

    public CommonPageSteps openLeftMenu() {
        System.out.println("Open left menu");
        commonPage.leftMenuButton.click();
        leftMenu = commonPage.new LeftMenu();
        return this;
    }

    public LoginPageSteps logout() {
        System.out.println("Logout");
        leftMenu.logoutButton.click();
        return new LoginPageSteps();
    }

    public CommonPageSteps closeLeftMenu() {
        System.out.println("Close left menu");
        leftMenu.closeMenuButton.click();
        return this;
    }

    public CommonPageSteps checkUrlContains(String url) {
        System.out.println("Check that url contains '" + url + "'");
        Assert.assertTrue(WebDriverRunner.getWebDriver().getCurrentUrl().contains(url), String.format("Url should contain ", url));
        return this;
    }
}
