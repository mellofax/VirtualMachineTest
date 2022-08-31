package tests;

import com.codeborne.selenide.Selenide;
import core.DriverConfiguration;
import core.classes.Item;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import steps.LoginPageSteps;

import static core.Base.*;

public class SwagLabsTests {
    @BeforeSuite
    public void setUp() {
        DriverConfiguration.setDriver();
    }

    @BeforeMethod
    public void open() {
        System.out.println("Open url 'https://www.saucedemo.com'");
        Selenide.open("https://www.saucedemo.com");
    }

    @Test(testName = "Login test")
    public void login_test() {
        LoginPageSteps i = new LoginPageSteps();
        i.enterLogin(standard_user.getLogin())
                .enterPassword(standard_user.getPassword())
                .pressLogin()
                .checkUrlContains("inventory.html");
    }

    @Test(testName = "Check that start items count is 6")
    public void Check_items_count() {
        LoginPageSteps i = new LoginPageSteps();
        i.enterLogin(standard_user.getLogin())
                .enterPassword(standard_user.getPassword())
                .pressLogin()
                .assertItemsCount(6);
    }

    @Test(testName = "Check first item information")
    public void Check_first_item_information() {
        Item item = new Item("Sauce Labs Backpack", "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.", "$29.99");
        LoginPageSteps i = new LoginPageSteps();
        i.enterLogin(standard_user.getLogin())
                .enterPassword(standard_user.getPassword())
                .pressLogin()
                .assertItemInformation(0, item);
    }

    @Test(testName = "Check logout")
    public void Check_logout() {
        LoginPageSteps i = new LoginPageSteps();
        i.enterLogin(standard_user.getLogin())
                .enterPassword(standard_user.getPassword())
                .pressLogin()
                .openLeftMenu()
                .logout()
                .checkUrlContains("https://www.saucedemo.com");
    }

    @AfterMethod
    public void close() {
        Selenide.closeWebDriver();
    }
}
