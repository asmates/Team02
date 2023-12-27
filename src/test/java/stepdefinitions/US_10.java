package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AhmetPage;
import utilities.Driver;

public class US_10 {

    AhmetPage ahmetPage = new AhmetPage();

    @Given("Kullanici kitapsec sitesine gider")
    public void kullanici_kitapsec_sitesine_gider() {
        Driver.getDriver().get("https://www.kitapsec.com");
    }
    @When("kullanici CANTA butonuna tiklar")
    public void kullanici_canta_butonuna_tiklar() {
        ahmetPage.cantaBox.click();
    }
    @When("Kullanici Okul Urunleri butonuna tiklar")
    public void kullanici_okul_urunleri_butonuna_tiklar() {
        ahmetPage.okulUrunleriBox.click();
    }
    @Then("Kullanici tum urunleri listeler")
    public void kullanici_tum_urunleri_listeler() {
        ahmetPage.fiyat.isDisplayed();
    }
    @When("Kullanici Ilkokul Cantasi butonuna tiklar")
    public void kullanici_ilkokul_cantasi_butonuna_tiklar() {
        ahmetPage.ilkokulCantasiBox.click();
    }
    @When("Kullanici Okul Cantasi butonuna tiklar")
    public void kullanici_okul_cantasi_butonuna_tiklar() {
        ahmetPage.okulCantasiBox.click();
    }
    @When("Kullanici Beslenme Cantasi butonuna tiklar")
    public void kullanici_beslenme_cantasi_butonuna_tiklar() {
        ahmetPage.beslenmeCantasiBox.click();
    }
    @When("Kullanici Teknik Proje Cantasi butonuna tiklar")
    public void kullanici_teknik_proje_cantasi_butonuna_tiklar() {
        ahmetPage.teknikProjeCantasiBox.click();
    }
}
