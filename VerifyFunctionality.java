package QATechTestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import QATechPOMClasses.ContactUSPage;
import QATechPOMClasses.HomePage;

public class VerifyFunctionality {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome Browser is opened");
		driver.manage().window().maximize();
		driver.get("https://www.tendable.com");
		System.out.println("URL Open");
		driver.wait(6000);

		HomePage Access = new HomePage(driver);

		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Popup CTA']"));
		driver.switchTo().frame(iframe);
		Access.ClosePopUp();
		driver.switchTo().parentFrame();

		driver.wait(5000);
		Access.clickAbout();
		driver.wait(5000);
		String expectedAboutUrl = "https://www.tendable.com/about-us";
		String actualAboutUrl = driver.getCurrentUrl();
		System.out.println("Verifying the About access");
		if (expectedAboutUrl.equals(actualAboutUrl)) {
			System.out.println("About is accessibile");
		} else {
			System.out.println("About is not accessibile");
		}

		Access.clickProduct();
		driver.wait(5000);
		String expectedProductUrl = "https://www.tendable.com/product-features";
		String actualProductUrl = driver.getCurrentUrl();
		System.out.println("Verifying the Product access");
		if (expectedProductUrl.equals(actualProductUrl)) {
			System.out.println("Product is accessibile");
		} else {
			System.out.println("Product is not accessibile");
		}

		Access.clickSectors();
		driver.wait(5000);
		String expectedSectorUrl = "https://www.tendable.com/sectors";
		String actualSectorUrl = driver.getCurrentUrl();
		System.out.println("Verifying the Sector access");
		if (expectedSectorUrl.equals(actualSectorUrl)) {
			System.out.println("Sector is accessibile");
		} else {
			System.out.println("Sector is not accessibile");
		}

		Access.clickContentHub();
		driver.wait(5000);
		String expectedContetHubUrl = "https://www.tendable.com/content-hub/content-hub";
		String actualContentHubUrl = driver.getCurrentUrl();
		System.out.println("Verifying the ContentHub access");
		if (expectedContetHubUrl.equals(actualContentHubUrl)) {
			System.out.println("ContentHub is accessibile");
		} else {
			System.out.println("ContentHub is not accessibile");
		}

		Access.VerifyBookDemo();
		driver.wait(2000);

		Access.clickContact();
		driver.wait(5000);
		ContactUSPage form = new ContactUSPage(driver);
		form.sendEmail();
		form.sendFirstName();
		form.sendLastName();
		form.sendCompany();
		form.selectDropdown();
		form.clickCheckBox();
		form.submit();
		String expectedmessage = "Form Submission Failed";
		String actualmessage = "Form Submission Failed";
		if (expectedmessage.equals(actualmessage)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test Failed");
		}

	}

}
