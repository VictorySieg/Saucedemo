package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.SaucedemoWebshopPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.concurrent.TimeUnit;

public class SiteFunctionalityStepDef {
    SaucedemoWebshopPage saucedemo=new SaucedemoWebshopPage();
    Actions action = new Actions(Driver.getDriver());
    private WebDriver driver;
    String firstItemName;
    @When("Klicken Sie auf den Link vom ersten \\(oben links stehenden) Produkt.")
    public void klicken_sie_auf_den_link_vom_ersten_oben_links_stehenden_produkt() {
     firstItemName=saucedemo.firstItem.getText();
     saucedemo.firstItem.click();
    }

    @Then("Überprüfen Sie, ob der Produktname vor dem Anklicken des Produkts derselbe ist wie nach dem Anklicken des Produkts.")
    public void überprüfenSieObDerProduktnameVorDemAnklickenDesProduktsDerselbeIstWieNachDemAnklickenDesProdukts() {
        String firstItemAfterClick = saucedemo.firstItemAfterClick.getText();
        Assert.assertEquals(firstItemAfterClick,firstItemName);
    }

    @When("Klicken Sie auf das Menu Symbol mit den drei Strichen oben links.")
    public void klickenSieAufDasMenuSymbolMitDenDreiStrichenObenLinks() {
        saucedemo.menuButton.click();
    }

    @And("Klicken Sie auf die Schaltfläche About.")
    public void klickenSieAufDieSchaltflächeAbout() {
        saucedemo.aboutButton.click();
    }

    @Then("Überprüfen Sie, ob die About-Seite geöffnet ist und die Schaltfläche Try It Free in der Mitte der Seite angezeigt wird.")
    public void überprüfenSieObDieAboutSeiteGeöffnetIstUndDieSchaltflächeTryItFreeInDerMitteDerSeiteAngezeigtWird() {
    Assert.assertTrue(saucedemo.tryItFreeButton.isDisplayed());
    }

    @Given("Geben Sie den Benutzernamen problem_user in das Username-Feld ein.")
    public void gebenSieDenBenutzernamenProblem_userInDasUsernameFeldEin() {
        saucedemo.userNameInputBox.sendKeys("problem_user");
    }

    @And("Klicken Sie auf die Schaltfläche About mit Problem Useraccount.")
    public void klickenSieAufDieSchaltflächeAboutMitProblemUseraccount() {
        saucedemo.aboutButtonProblemUser.click();
    }

    @And("Klicken Sie auf den Log Out-Button.")
    public void klickenSieAufDenLogOutButton() {
        saucedemo.logOutButton.click();
    }

    @Then("Überprüfen Sie, ob der Benutzer erfolgreich abgemeldet und der Log In-Button auf der Seite angezeigt wird.")
    public void überprüfenSieObDerBenutzerErfolgreichAbgemeldetUndDerLogInButtonAufDerSeiteAngezeigtWird() {
       Assert.assertTrue( saucedemo.logInButton.isDisplayed());
    }

    @When("Klicken Sie auf den Add to Cart-Button des ersten Produkts.")
    public void klickenSieAufDenAddToCartButtonDesErstenProdukts() {
        saucedemo.addToCartButton1.click();
    }

    @And("Klicken Sie auf das Warenkorbsymbol.")
    public void klickenSieAufDasWarenkorbsymbol() {
        saucedemo.shoppingCart.click();
    }

    @Then("Überprüfen Sie, ob das Produkt im Warenkorb angezeigt wird.")
    public void überprüfenSieObDasProduktImWarenkorbAngezeigtWird() {
        String shoppingCartItem =saucedemo.shoppingCartItem.getText();
        Assert.assertEquals(shoppingCartItem,firstItemName);

    }

    @Then("Überprüfen Sie, ob alle sechs Produkte erfolgreich zum Warenkorb hinzugefügt wurden.")
    public void überprüfenSieObAlleSechsProdukteErfolgreichZumWarenkorbHinzugefügtWurden() {
        String expectedItemNumber = "6";
        String actualItemNumber = saucedemo.shoppingCartItemNumber.getText();
        Assert.assertEquals(expectedItemNumber, actualItemNumber);
    }

    @When("Klicken Sie auf die Schaltfläche add to cart für alle {int} Produkte.")
    public void klickenSieAufDieSchaltflächeAddToCartFürAlleProdukte(int arg0) {
        action.click(saucedemo.addToCartButton1).perform();
        action.click(saucedemo.addToCartButton2).perform();
        action.click(saucedemo.addToCartButton3).perform();
        action.click(saucedemo.addToCartButton4).perform();
        action.click(saucedemo.addToCartButton5).perform();
        action.click(saucedemo.addToCartButton6).perform();

    }

    @And("Klicken Sie erneut auf die Schaltfläche, die jetzt in Remove umbenannt wurde.")
    public void klickenSieErneutAufDieSchaltflächeDieJetztInRemoveUmbenanntWurde() {
        saucedemo.removeButton.click();
    }

    @Then("Überprüfen Sie, ob sich der Name der Schaltfläche wieder in Add to Cart geändert hat und das Produkt erfolgreich aus dem Warenkorb entfernt wurde.")
    public void überprüfenSieObSichDerNameDerSchaltflächeWiederInAddToCartGeändertHatUndDasProduktErfolgreichAusDemWarenkorbEntferntWurde() {
        Assert.assertTrue(saucedemo.addToCartButton1.isDisplayed());
    }

    @Given("Geben Sie den Benutzernamen performance_glitch_user in das Username-Feld ein.")
    public void gebenSieDenBenutzernamenPerformance_glitch_userInDasUsernameFeldEin() {
        saucedemo.userNameInputBox.sendKeys("performance_glitch_user");
    }

    @Then("Überprüfe, ob der Benutzer innerhalb  von maximal {int} Sekunde angemeldet ist und zur Hauptseite navigiert wird.")
    public void überprüfeObDerBenutzerInnerhalbVonMaximalSekundeAngemeldetIstUndZurHauptseiteNavigiertWird(int arg0) {
        ReusableMethods.setImplicitWaits1Sec();

        Assert.assertTrue(saucedemo.shoppingCart.isDisplayed());
        ReusableMethods.setImplicitWaits10sec();
    }



    @Then("Geben Sie gültige First Name, Last Name, zipcode ein")
    public void gebenSieGültigeFirstNameLastNameZipcodeEin() {
        action.click(saucedemo.firstNameInputBox).sendKeys("max").
                sendKeys(Keys.TAB).sendKeys("mustermann").sendKeys(Keys.TAB).
                sendKeys("11111").perform();
    }

    @And("Klicken Sie auf Continue Feld")
    public void klickenSieAufContinueFeld() {
        saucedemo.continueBUtton.click();
    }

    @And("Klicken Sie auf Finish Feld auf der Checkout: Overview Seite")
    public void klickenSieAufFinishFeldAufDerCheckoutOverviewSeite() {
        saucedemo.finishBUtton.click();
    }

    @Then("Überprüfe , ob das Produkt erfolgreich bestellt wurde")
    public void überprüfeObDasProduktErfolgreichBestelltWurde() {
        Assert.assertTrue(saucedemo.backToProductsBUtton.isDisplayed());
    }

    @And("Klicken Sie auf den Checkout-Button")
    public void klickenSieAufDenCheckoutButton() {
        saucedemo.checkoutButton.click();
    }
}
