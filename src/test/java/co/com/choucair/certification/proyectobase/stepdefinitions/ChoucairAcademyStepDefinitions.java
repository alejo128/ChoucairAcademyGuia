package co.com.choucair.certification.proyectobase.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Alejandro wants to learn automation at the academy Choucair$")
    public void thanAlejandroWantsToLearnAutomationAtTheAcademyChoucair() {

    }


    @When("^he search for the course Recursos Automatización Bancolombia on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform() {

    }

    @Then("^he finds the course called resources Recursos Automatización Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia() {

    }

}
