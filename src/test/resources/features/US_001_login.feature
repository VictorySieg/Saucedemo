@US_001
Feature: Saucedemo Webshop Login

  Background: Common steps
    Given Navigieren Sie zur Saucedemo Webshop Seite

  Scenario:TC_001 Uberprufen, ob die Anmeldung mit gultigem Benutzernamen und Passwort erfolgreich ist.

    Given Geben Sie den Benutzernamen standard_user in das Username-Feld ein.
    And   Geben Sie das Passwort secret_sauce in das Password-Feld ein.
    When  Klicken Sie auf die Schaltfläche Login.
    Then  Bestätigen Sie, dass der Benutzer erfolgreich eingeloggt ist und der Text "Swag Labs" oben in der Mitte der Seite angezeigt wird.


     Scenario:TC_002 Überprüfen der Anmeldung mit leerem Benutzernamen und Passwort.
    Given Lassen Sie das Username-Feld leer.
    And   Lassen Sie das Password-Feld leer.
    Then  Klicken Sie auf die Schaltfläche Login.
    Then  Bestätigen Sie, dass der Login nicht erfolgreich war und die Fehlermeldung Epic sadface: Username is required angezeigt wird.


  Scenario:TC_003 Überprüfen der Anmeldung mit einem Benutzernamen, aber leerem Passwort.

    Given Geben Sie den Benutzernamen standard_user in das Username-Feld ein.
    And  Lassen Sie das Password-Feld leer.
    When Klicken Sie auf die Schaltfläche Login.
    Then Bestätigen Sie, dass der Login nicht erfolgreich war und die Fehlermeldung Epic sadface: Password is required angezeigt wird.



  Scenario:TC_004 Überprüfen der Anmeldung mit leerem Benutzernamen, aber einem Passwort.

    Given Lassen Sie das Username-Feld leer.
    And   Geben Sie das Passwort secret_sauce in das Password-Feld ein.
    When  Klicken Sie auf die Schaltfläche Login.
    Then  Bestätigen Sie, dass der Login nicht erfolgreich war und die Fehlermeldung Epic sadface: Username is required angezeigt wird.


  Scenario:TC_005 Überprüfen der Anmeldung mit einem gesperrten Benutzerkonto.

    Given Geben Sie den Benutzernamen locked_out_user in das Username-Feld ein.
    And   Geben Sie das Passwort secret_sauce in das Password-Feld ein.
    When  Klicken Sie auf die Schaltfläche Login.
    Then  Bestätigen Sie, dass der Login nicht erfolgreich war und die Fehlermeldung Epic sadface: Sorry, this user has been locked out. angezeigt wird.



