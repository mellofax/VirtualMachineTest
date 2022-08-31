package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public LoginPage() {
        form.shouldBe(Condition.visible, Condition.exist);
    }
    public final SelenideElement form = $(".login-box");

    public final SelenideElement loginInput = form.$("#user-name");
    public final SelenideElement passwordInput = form.$("#password");
    public final SelenideElement loginButton = form.$("#login-button");
}
