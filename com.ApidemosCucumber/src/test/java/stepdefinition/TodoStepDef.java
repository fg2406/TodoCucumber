package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ToDoPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TodoStepDef {


    ToDoPage toDoPage = new ToDoPage();
    @Given("Plus Button klicken")
    public void plus_button_klicken() {
        toDoPage.plusButton.click();
    }

    @Given("{string} in Textfeld schreiben")
    public void in_textfeld_schreiben(String string) {
        toDoPage.textBox.sendKeys(string);
    }

    @Given("done klicken")
    public void done_klicken() {
        toDoPage.doneButton.click();
    }

    @Given("cancel klicken")
    public void cancel_klicken() {
        toDoPage.cancelButton.click();
    }

    @Then("{string} ist sichtbar")
    public void ist_sichtbar(String string) throws IOException {
        ReusableMethods.getScreenshot("message1");
    }

    @Then("Fehlermeldung {string} erscheint")
    public void fehlermeldung_erscheint(String string) throws IOException {
        ReusableMethods.getScreenshot("message2");
    }

    @Given("Neuer Task {string} wurde erstellt und ist in der Liste sichtbar")
    public void neuer_task_wurde_erstellt_und_ist_in_der_liste_sichtbar(String string) throws IOException {
        ReusableMethods.getScreenshot("message3");    }

    @And("Mülltonnen Icon klicken")
    public void mülltonnenIconKlicken() {
        toDoPage.deleteIcon.click();
}

    @Then("{string} erscheint")
    public void erscheint(String string) throws IOException {
        ReusableMethods.getScreenshot("message4");
    }

    @Given("Sonne\\/Mond Icon clicken")
    public void sonneMondIconClicken() throws InterruptedException, IOException {
        toDoPage.moonSunButton.click();
        Thread.sleep(3000);
        ReusableMethods.getScreenshot("message5");

    }

    @Then("dunkel und hell sind sichtbar")
    public void dunkel_und_hell_sind_sichtbar() throws IOException, InterruptedException {
        Thread.sleep(2000);
        toDoPage.moonSunButton.click();
        ReusableMethods.getScreenshot("message6");

    }


}
