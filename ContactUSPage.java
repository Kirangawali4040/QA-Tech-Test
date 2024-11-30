package QATechPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUSPage {

	private WebDriver driver;

	@FindBy(xpath = "(//input[@id='email'])[1]")
	private WebElement email;

	@FindBy(xpath = "(//input[@id='firstname'])[1]")
	private WebElement firstName;

	@FindBy(xpath = "(//input[@id='lastname'])[1]")
	private WebElement lastName;

	@FindBy(xpath = "(//input[@id='company'])[1]")
	private WebElement company;

	@FindBy(xpath = "//div[@class='form_field-wrapper']//textarea[@id='message']")
	private WebElement message;

	@FindBy(xpath = "(//select[@name='message_type'])[1]")
	private WebElement Dropdown;

	@FindBy(xpath = "(//select[@name='message_type']//option[@name='Marketing'])[1]")
	private WebElement Marketing;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement checkbox;

	@FindBy(xpath = "//div[@class='margin-top margin-small']//button[@type='submit']")
	private WebElement Submit;

	public ContactUSPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void sendEmail() {
		email.sendKeys("kirangawali@gmail.com");
	}

	public void sendFirstName() {
		firstName.sendKeys("Kiran");
	}

	public void sendLastName() {
		lastName.sendKeys("Gawali");
	}

	public void sendCompany() {
		company.sendKeys("Tendable");
	}

	public void sendMessage() {
		message.sendKeys("xyz");
	}

	public void selectDropdown() {
		Dropdown.click();
		Select s = new Select(Dropdown);

		s.selectByIndex(2);
	}

	public void clickCheckBox() {
		checkbox.click();
	}

	public void submit() {
		Submit.click();
	}

}
