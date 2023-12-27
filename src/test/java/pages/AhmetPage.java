package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AhmetPage {

    public AhmetPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='ÇANTA']")
    public WebElement cantaBox;

    @FindBy(xpath = "(//a[text()='Okul Ürünleri'])[2]")
    public WebElement okulUrunleriBox;

    @FindBy(xpath = "//font[@class='satis']")
    public WebElement fiyat;

    @FindBy(xpath = "//a[text()='İlkokul Çantası']")
    public WebElement ilkokulCantasiBox;

    @FindBy(xpath = "//a[text()='Okul Çantası']")
    public WebElement okulCantasiBox;

    @FindBy(xpath = "//a[text()='Beslenme Çantası']")
    public WebElement beslenmeCantasiBox;

    @FindBy(xpath = "//a[text()='Teknik Proje Çantası']")
    public WebElement teknikProjeCantasiBox;

}
