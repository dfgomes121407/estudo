package testCucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testCucumber.Hooks;
import testCucumber.pageobjects.LoginPage;
import testCucumber.pageobjects.LoginPage;

public class EfetuarCadastroSteps {

    private LoginPage loginPage = new LoginPage(Hooks.getNavegador());

    @Given("^que eu acesse o site$")
    public void que_eu_acesse_o_site() throws Exception {
        this.loginPage.navigateTo("http://www.juliodelima.com.br/taskit/");
    }

    @When("^eu clicar no botao de cadastro$")
    public void eu_clicar_no_botao_de_cadastro() throws Exception {
        this.loginPage.clicaNoBotao();
        Thread.sleep(3000);
    }

    @Then("^eu vou efetuar o cadastro$")
    public void eu_vou_efetuar_o_cadastro() throws Exception {

        this.loginPage.preencheLogin();
        Thread.sleep(5000);

    }

}
