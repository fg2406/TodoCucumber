@ToDo
Feature: ToDo Test
  @ToDo1
  Scenario: Hinzufügen einer Aufgabe
    Given Plus Button klicken
    And "Test" in Textfeld schreiben
    And done klicken
    Then Neuer Task "Test" wurde erstellt und ist in der Liste sichtbar

  @ToDo2
  Scenario:Hinzufügen einer Aufgabe abbrechen
    Given Plus Button klicken
    And "Test" in Textfeld schreiben
    And cancel klicken
    Then "What do you want to do today?" ist sichtbar

  @ToDo3
  Scenario:Hinzufügen einer Aufgabe ohne Titel
    Given Plus Button klicken
    And done klicken
    Then Fehlermeldung "Oops, Cannot set an empty text" erscheint

  @ToDo4
  Scenario:Hinzugefügte Aufgabe löschen
    Given Plus Button klicken
    And "Test" in Textfeld schreiben
    And done klicken
    And Neuer Task "Test" wurde erstellt und ist in der Liste sichtbar
    And Mülltonnen Icon klicken
    Then "Deleted successfully" erscheint

  @ToDo5
  Scenario:Tag-/Nachtmodus wechseln
    Given Sonne/Mond Icon clicken
    Then dunkel und hell sind sichtbar