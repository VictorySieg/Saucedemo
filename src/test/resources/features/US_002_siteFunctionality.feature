@US_002
Feature: Saucedemo Webshop SiteFunctionality

  Background: Common steps
    Given Navigieren Sie zur Saucedemo Webshop Seite
  @zafer
  Scenario:TC_001 Überprüfen Sie, ob der Produktname vor dem Anklicken des Produkts derselbe ist wie nach dem Anklicken des Produkts.

    Given Geben Sie den Benutzernamen standard_user in das Username-Feld ein.
    Then  Geben Sie das Passwort secret_sauce in das Password-Feld ein.
    And   Klicken Sie auf die Schaltfläche Login.
    When  Klicken Sie auf den Link vom ersten (oben links stehenden) Produkt.
    Then  Überprüfen Sie, ob der Produktname vor dem Anklicken des Produkts derselbe ist wie nach dem Anklicken des Produkts.



  Scenario:TC_002 Überprüfen Sie die ordnungsgemäße Funktion des "About"-Buttons.

    Given Geben Sie den Benutzernamen standard_user in das Username-Feld ein.
    Then  Geben Sie das Passwort secret_sauce in das Password-Feld ein.
    And   Klicken Sie auf die Schaltfläche Login.
    When  Klicken Sie auf das Menu Symbol mit den drei Strichen oben links.
    And   Klicken Sie auf die Schaltfläche About.
    Then  Überprüfen Sie, ob die About-Seite geöffnet ist und die Schaltfläche Try It Free in der Mitte der Seite angezeigt wird.


  Scenario:TC_003 Überprüfen der Funktionalität der Schaltfläche "Add to Cart" und "Remove"

    Given Geben Sie den Benutzernamen standard_user in das Username-Feld ein.
    Then  Geben Sie das Passwort secret_sauce in das Password-Feld ein.
    And   Klicken Sie auf die Schaltfläche Login.
    When  Klicken Sie auf den Add to Cart-Button des ersten Produkts.
    And   Klicken Sie erneut auf die Schaltfläche, die jetzt in Remove umbenannt wurde.
    Then  Überprüfen Sie, ob sich der Name der Schaltfläche wieder in Add to Cart geändert hat und das Produkt erfolgreich aus dem Warenkorb entfernt wurde.


    Scenario:TC_004 Überprüfen, ob alle sechs Produkte zusammen zum Warenkorb hinzugefügt werden können

      Given  Geben Sie den Benutzernamen standard_user in das Username-Feld ein.
      Then   Geben Sie das Passwort secret_sauce in das Password-Feld ein.
      And    Klicken Sie auf die Schaltfläche Login.
      When   Klicken Sie auf die Schaltfläche add to cart für alle 6 Produkte.
      Then   Überprüfen Sie, ob alle sechs Produkte erfolgreich zum Warenkorb hinzugefügt wurden.


      Scenario:TC_005 Überprüfen der Abmeldung (Log Out) eines Benutzers

        Given Geben Sie den Benutzernamen standard_user in das Username-Feld ein.
        Then  Geben Sie das Passwort secret_sauce in das Password-Feld ein.
        And   Klicken Sie auf die Schaltfläche Login.
        When  Klicken Sie auf das Menu Symbol mit den drei Strichen oben links.
        And   Klicken Sie auf den Log Out-Button.
        Then  Überprüfen Sie, ob der Benutzer erfolgreich abgemeldet und der Log In-Button auf der Seite angezeigt wird.


     Scenario:TC_006   Überprüfen, ob Produkte erfolgreich zum Warenkorb hinzugefügt werden können.

       Given Geben Sie den Benutzernamen standard_user in das Username-Feld ein.
       Then  Geben Sie das Passwort secret_sauce in das Password-Feld ein.
       And   Klicken Sie auf die Schaltfläche Login.
       When  Klicken Sie auf den Add to Cart-Button des ersten Produkts.
       And   Klicken Sie auf das Warenkorbsymbol.
       Then  Überprüfen Sie, ob das Produkt im Warenkorb angezeigt wird.


      Scenario:TC_007 Überprüfen ob ein Produkt im Webshop erfolgreich bestellt werden kann.

        Given Geben Sie den Benutzernamen standard_user in das Username-Feld ein.
        Then  Geben Sie das Passwort secret_sauce in das Password-Feld ein.
        And   Klicken Sie auf die Schaltfläche Login.
        Then  Klicken Sie auf den Add to Cart-Button des ersten Produkts.
        And   Klicken Sie auf das Warenkorbsymbol.
        And   Klicken Sie auf den Checkout-Button
        Then  Geben Sie gültige First Name, Last Name, zipcode ein
        And   Klicken Sie auf Continue Feld
        And   Klicken Sie auf Finish Feld auf der Checkout: Overview Seite
        Then  Überprüfe , ob das Produkt erfolgreich bestellt wurde



  Scenario:TC_008 Überprüfen Sie mit Benutzername "problem_user", ob alle sechs Produkte zusammen zum Warenkorb hinzugefügt werden können

          Given Geben Sie den Benutzernamen problem_user in das Username-Feld ein.
          Then  Geben Sie das Passwort secret_sauce in das Password-Feld ein.
          And   Klicken Sie auf die Schaltfläche Login.
          When  Klicken Sie auf die Schaltfläche add to cart für alle 6 Produkte.
          Then  Überprüfen Sie, ob alle sechs Produkte erfolgreich zum Warenkorb hinzugefügt wurden.


        Scenario:TC_009 Überprüfen Sie mit Benutzername "problem_user", ob der Produktname vor dem Anklicken des Produkts derselbe ist wie nach dem Anklicken des Produkts.

          Given Geben Sie den Benutzernamen problem_user in das Username-Feld ein.
          Then  Geben Sie das Passwort secret_sauce in das Password-Feld ein.
          And   Klicken Sie auf die Schaltfläche Login.
          When  Klicken Sie auf den Link vom ersten (oben links stehenden) Produkt.
          Then  Überprüfen Sie, ob der Produktname vor dem Anklicken des Produkts derselbe ist wie nach dem Anklicken des Produkts.

     @fehler
       Scenario:TC_010 Überprüfen mit Benutzername "problem_user" der Funktionalität der Schaltfläche "Add to Cart" und "Remove"

         Given Geben Sie den Benutzernamen problem_user in das Username-Feld ein.
         Then  Geben Sie das Passwort secret_sauce in das Password-Feld ein.
         And   Klicken Sie auf die Schaltfläche Login.
         When  Klicken Sie auf den Add to Cart-Button des ersten Produkts.
         And   Klicken Sie erneut auf die Schaltfläche, die jetzt in Remove umbenannt wurde.
         Then  Überprüfen Sie, ob sich der Name der Schaltfläche wieder in Add to Cart geändert hat und das Produkt erfolgreich aus dem Warenkorb entfernt wurde.


     Scenario:TC_011 Überprüfung der Benutzeranmeldung und Navigation zur Hauptseite innerhalb von maximal 1 Sekunde

       Given Geben Sie den Benutzernamen performance_glitch_user in das Username-Feld ein.
       Then  Geben Sie das Passwort secret_sauce in das Password-Feld ein.
       And   Klicken Sie auf die Schaltfläche Login.
       Then  Überprüfe, ob der Benutzer innerhalb  von maximal 1 Sekunde angemeldet ist und zur Hauptseite navigiert wird.


      Scenario:TC_012 Überprüfen Sie mit Benutzername "problem_user" die ordnungsgemäße Funktion des "About"-Buttons.

        Given Geben Sie den Benutzernamen problem_user in das Username-Feld ein.
        Then  Geben Sie das Passwort secret_sauce in das Password-Feld ein.
        And   Klicken Sie auf die Schaltfläche Login.
        When  Klicken Sie auf das Menu Symbol mit den drei Strichen oben links.
        And   Klicken Sie auf die Schaltfläche About mit Problem Useraccount.
        Then  Überprüfen Sie, ob die About-Seite geöffnet ist und die Schaltfläche Try It Free in der Mitte der Seite angezeigt wird.


        Scenario:TC_012 Überprüfen mit benutzername "problem_user" ob ein Produkt im Webshop erfolgreich bestellt werden kann.

          Given Geben Sie den Benutzernamen problem_user in das Username-Feld ein.
          Then  Geben Sie das Passwort secret_sauce in das Password-Feld ein.
          And   Klicken Sie auf die Schaltfläche Login.
          Then  Klicken Sie auf den Add to Cart-Button des ersten Produkts.
          And   Klicken Sie auf das Warenkorbsymbol.
          And   Klicken Sie auf den Checkout-Button
          Then  Geben Sie gültige First Name, Last Name, zipcode ein
          And   Klicken Sie auf Continue Feld
          And   Klicken Sie auf Finish Feld auf der Checkout: Overview Seite
          Then  Überprüfe , ob das Produkt erfolgreich bestellt wurde

