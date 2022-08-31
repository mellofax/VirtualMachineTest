package steps;

import core.classes.Item;
import org.testng.Assert;
import pages.HomePage;

public class HomePageSteps extends CommonPageSteps<HomePageSteps> {
    public HomePageSteps() {
        this.homePage = new HomePage();
    }
    private HomePage homePage;

    public HomePageSteps assertItemsCount(int count) {
        Assert.assertEquals(homePage.menuItems.size(), count, String.format("Items count should be ", count));
        return this;
    }

    public HomePageSteps selectItemWithNumber(int number) {
        System.out.println("Select item with number '" + number + "'");
        homePage.menuItems.get(number).$(".btn_inventory").click();
        Assert.assertEquals(homePage.menuItems.get(number).$(".btn_inventory").getText(), "Remove", "The button should be Remove");
        return this;
    }

    public HomePageSteps assertItemInformation(int number, Item item) {
        System.out.println("Assert item information");
        Assert.assertTrue(item.equals(homePage.getItemInformation(homePage.menuItems.get(number))), "Items not equals");
        return this;
    }
}
