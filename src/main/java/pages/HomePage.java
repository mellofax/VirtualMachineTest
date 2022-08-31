package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import core.classes.Item;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    public HomePage() {
        basketButton.shouldBe(Condition.visible, Condition.exist);
    }
    public final ElementsCollection menuItems = $$(".inventory_item");
    public final SelenideElement basketButton = $("#shopping_cart_container");

    public Item getItemInformation(SelenideElement element) {
        String name = element.$(".inventory_item_name").getText();
        String description = element.$(".inventory_item_desc").getText();
        String price = element.$(".inventory_item_price").getText();
        return new Item(name, description, price);
    }
}
