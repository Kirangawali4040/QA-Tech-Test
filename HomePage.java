package QATechPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver;

	@FindBy(xpath = "//div[@class='navbar7_menu-left']//a[text()='About']")
	private WebElement About;

	@FindBy(xpath = "//div[@class='navbar7_menu-left']//a[text()='Products']")
	private WebElement Products;

	@FindBy(xpath = "//div[@class='navbar7_menu-left']//a[text()='Sectors']")
	private WebElement Sectors;

	@FindBy(xpath = "//div[@class='navbar7_menu-left']//a[text()='Content Hub']")
	private WebElement ContentHub;

	@FindBy(xpath = "//div[@class='navbar7_menu-left']//a[text()='Contact']")
	private WebElement Contact;

	@FindBy(xpath = "//div[@class='navbar7_menu-right']//a[contains(@class,'button is-')][2]")
	private WebElement Bookdemo;

	@FindBy(xpath = "//div[@class='button-container']//div[@id='interactive-close-button']")
	private WebElement ClosePopUp;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ClosePopUp() {
		ClosePopUp.click();
	}

	public void clickAbout() {
		About.click();
	}

	public void clickProduct() {
		Products.click();
	}

	public void clickSectors() {
		Sectors.click();
	}

	public void clickContentHub() {
		ContentHub.click();
	}

	public void clickContact() {
		Contact.click();
	}

	public void VerifyBookDemo() {
		Bookdemo.isDisplayed();
		Bookdemo.isEnabled();
	}
}