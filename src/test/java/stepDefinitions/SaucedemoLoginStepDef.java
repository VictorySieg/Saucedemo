package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.SaucedemoWebshopPage;
import utilities.ConfigReader;
import utilities.Driver;

public class SaucedemoLoginStepDef {
    SaucedemoWebshopPage saucedemo=new SaucedemoWebshopPage();
    Actions action = new Actions(Driver.getDriver());
    private WebDriver driver;

    @Given("Navigieren Sie zur Saucedemo Webshop Seite")
    public void navigieren_sie_zur_saucedemo_webshop_seite() {
        Driver.getDriver().get(ConfigReader.getProperty("SaucedemoWebSeite"));
    }

    @Then("Klicken Sie einfach auf den {string}-Button im angezeigten Alert-Fenster.")
    public void klickenSieEinfachAufDenButtonImAngezeigtenAlertFenster(String arg0) {
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    @And("Bestätigen Sie, dass der Benutzer erfolgreich eingeloggt ist und der Text {string} oben in der Mitte der Seite angezeigt wird.")
    public void bestätigenSieDassDerBenutzerErfolgreichEingeloggtIstUndDerTextObenInDerMitteDerSeiteAngezeigtWird(String arg0) {
        String expectedText="Swag Labs";
        String actualText= saucedemo.textSwagLabs.getText();
        Assert.assertTrue(actualText.equals(expectedText));

    }

    @When("Klicken Sie auf die Schaltfläche Login.")
    public void klickenSieAufDieSchaltflächeLogin() {
        saucedemo.logInButton.click();
    }

    @Given("Lassen Sie das Username-Feld leer.")
    public void lassenSieDasUsernameFeldLeer() {
        action.click(saucedemo.userNameInputBox).sendKeys(Keys.TAB);
    }

    @And("Lassen Sie das Password-Feld leer.")
    public void lassenSieDasPasswordFeldLeer() {
        action.sendKeys(Keys.TAB);
    }

    @Then("Bestätigen Sie, dass der Login nicht erfolgreich war und die Fehlermeldung Epic sadface: Sorry, this user has been locked out. angezeigt wird.")
    public void bestätigenSieDassDerLoginNichtErfolgreichWarUndDieFehlermeldungEpicSadfaceSorryThisUserHasBeenLockedOutAngezeigtWird() {
        String expectedResult= "Epic sadface: Sorry, this user has been locked out.";
        String actualResult= saucedemo.errorMessage.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("Geben Sie das Passwort secret_sauce in das Password-Feld ein.")
    public void gebenSieDasPasswortSecret_sauceInDasPasswordFeldEin() {
        saucedemo.passwordInputBox.sendKeys("secret_sauce");
    }

    @Given("Geben Sie den Benutzernamen standard_user in das Username-Feld ein.")
    public void gebenSieDenBenutzernamenStandard_userInDasUsernameFeldEin() {
        saucedemo.userNameInputBox.sendKeys("standard_user");
    }

    @Then("Bestätigen Sie, dass der Login nicht erfolgreich war und die Fehlermeldung Epic sadface: Username is required angezeigt wird.")
    public void bestätigenSieDassDerLoginNichtErfolgreichWarUndDieFehlermeldungEpicSadfaceUsernameIsRequiredAngezeigtWird() {
        String expectedResult= "Epic sadface: Username is required";
        String actualResult= saucedemo.errorMessage.getText();
        System.out.println(actualResult);
        Assert.assertEquals(expectedResult, actualResult);
        Driver.closeDriver();
    }

    @Then("Bestätigen Sie, dass der Login nicht erfolgreich war und die Fehlermeldung Epic sadface: Password is required angezeigt wird.")
    public void bestätigenSieDassDerLoginNichtErfolgreichWarUndDieFehlermeldungEpicSadfacePasswordIsRequiredAngezeigtWird() {
        String expectedResult= "Epic sadface: Password is required";
        String actualResult= saucedemo.errorMessage.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Given("Geben Sie den Benutzernamen locked_out_user in das Username-Feld ein.")
    public void gebenSieDenBenutzernamenLocked_out_userInDasUsernameFeldEin() {
        saucedemo.userNameInputBox.sendKeys("locked_out_user");
    }



}