package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CommonPage {
    public final SelenideElement leftMenuButton = $("#react-burger-menu-btn");

    public class LeftMenu {

        public LeftMenu() {
            form.shouldBe(Condition.visible, Condition.exist);
        }
        public final SelenideElement form = $(".bm-menu-wrap");
        public final SelenideElement allItemsButton = form.$("#inventory_sidebar_link");
        public final SelenideElement aboutButton = form.$("#about_sidebar_link");
        public final SelenideElement logoutButton = form.$("#logout_sidebar_link");
        public final SelenideElement resetAppStateButton = form.$("#reset_sidebar_link");
        public final SelenideElement closeMenuButton = $("#react-burger-cross-btn");
    }
}
