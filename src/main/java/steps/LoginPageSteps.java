package steps;

import pages.LoginPage;

public class LoginPageSteps extends CommonPageSteps<LoginPageSteps> {

    public LoginPageSteps() {
        this.loginPage = new LoginPage();
    }
    private LoginPage loginPage;

    public LoginPageSteps enterLogin(String login) {
        System.out.println("Enter login '" + login + "'");
        loginPage.loginInput.setValue(login);
        return this;
    }

    public LoginPageSteps enterPassword(String password) {
        System.out.println("Enter password '" + password + "'");
        loginPage.passwordInput.setValue(password);
        return this;
    }

    public HomePageSteps pressLogin() {
        System.out.println("Press login button");
        loginPage.loginButton.click();
        return new HomePageSteps();
    }
}
