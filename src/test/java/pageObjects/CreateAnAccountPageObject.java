package pageObjects;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class CreateAnAccountPageObject {

	WebDriver driver;
	WebDriverWait wait;
	Scenario scn;

	// #YOUR PERSONAL INFORMATION
	private static final By SelectGender_Mr_Locator = By.xpath("//div[@id='uniform-id_gender1']");
	private static final By FirstName_Locator = By.xpath("//input[@id='customer_firstname']");
	private static final By LastName_Locator = By.xpath("//input[@id='customer_lastname']");
	private static final By Password_Locator = By.xpath("//input[@id='passwd']");
	// # Date of Birth
	private static final By Day_Locator = By.xpath("//select[@id='days']");////////
	private static final By Month_Locator = By.xpath("//select[@id='months']");//////
	private static final By Year_Locator = By.xpath("//select[@id='years']");///////
	private static final By SignUpForUurNewsletter_Locator = By.xpath("//label[text()='Sign up for our newsletter!']");
	private static final By ReceiveSpecialOffers_Locator = By
			.xpath("//label[text()='Receive special offers from our partners!']");
	// #YOUR ADDRESS
	private static final By FirstNameAddres_Locator = By.xpath("//input[@id='firstname']");
	private static final By LastNameAddress_Locator = By.xpath("//input[@id='lastname']");
	private static final By Company_Locator = By.xpath("//input[@id='company']");
	private static final By Address_Locator = By.xpath("//input[@id='address1']");
	private static final By City_Locator = By.xpath("//input[@id='city']");
	private static final By State_Locator = By.xpath("//select[@id='id_state']");////
	private static final By ZipCode_Locator = By.xpath("//input[@id='postcode']");
	private static final By Country_Locator = By.xpath("//select[@id='id_country']");///
	private static final By AdditionalInformation_Locator = By.xpath("//textarea[@id='other']");
	private static final By HomePhone_Locator = By.xpath("//input[@id='phone']");
	private static final By MobilePhone_Locator = By.xpath("//input[@id='phone_mobile']");
	private static final By AssignAnAddressAlias_Locator = By.xpath("//input[@id='alias']");
	private static final By MyAccount_Locator = By.xpath("//h1[text()='My account']");
	private static final By RegisterButon_Locator = By.xpath("//button[@id='submitAccount']");

	// variables
	private static final String MyAccount_Veriable = "MY ACCOUNT";

	public CreateAnAccountPageObject(WebDriver driver, WebDriverWait wait, Scenario scn) {
		this.driver = driver;
		this.scn = scn;
		this.wait = wait;
	}

	public void selectDay(String day) {
		WebElement day1 = driver.findElement(Day_Locator);
		Select select = new Select(day1);
		select.selectByValue(day);
		scn.log("Day of Birth :> " + day);
	}

	public void selectMonth(String Month) {
		WebElement Month1 = driver.findElement(Month_Locator);
		Select select = new Select(Month1);
		select.selectByValue(Month);
		scn.log("Month of Birth :> " + Month);
	}

	public void selectYear(String year) {
		WebElement year1 = driver.findElement(Year_Locator);
		Select select = new Select(year1);
		select.selectByValue(year);
		scn.log("Year of Birth :> " + year);
	}

	public void selectState(String State) {
		WebElement State1 = driver.findElement(State_Locator);
		Select select = new Select(State1);
		select.selectByValue(State);
		scn.log("Selected state is :> " + State);
	}

	public void selectCountry(String Country) {
		WebElement Country1 = driver.findElement(Country_Locator);
		Select select = new Select(Country1);
		select.selectByValue(Country);
		scn.log("Selected Country is :> " + Country);
	}

	public void selectGender() {
		WebElement male = driver.findElement(SelectGender_Mr_Locator);
		male.click();
		scn.log("Selected Gender is :> " + "Mr.");
	}

	public void enterValidData(io.cucumber.datatable.DataTable table) {
		List<String> rows = table.column(1);

		for (int i = 0; i < rows.size(); i++) {

			if (i == 1) {
				WebElement name = driver.findElement(FirstName_Locator);
				name.sendKeys(rows.get(1).toString());
				scn.log("First name :> " + rows.get(1).toString());
				continue;
			}

			if (i == 2) {
				WebElement lastName = driver.findElement(LastName_Locator);
				lastName.sendKeys(rows.get(2).toString());
				scn.log("Last name :> " + rows.get(2).toString());
				continue;
			}

			if (i == 3) {
				WebElement password = driver.findElement(Password_Locator);
				password.sendKeys(rows.get(3).toString());
				scn.log("Password :> " + rows.get(3).toString());
				continue;
			}

			if (i == 4) {
				selectDay(rows.get(4).toString());
				continue;
			}

			if (i == 5) {
				selectMonth(rows.get(5).toString());
				continue;
			}

			if (i == 6) {
				selectYear(rows.get(6).toString());
				continue;
			}

			if (i == 7) {
				WebElement SignUpForUurNewsletter = driver.findElement(SignUpForUurNewsletter_Locator);
				SignUpForUurNewsletter.click();
				scn.log("Sign up for our newsletter! :> " + rows.get(7).toString());
				continue;
			}

			if (i == 8) {
				WebElement ReceiveSpecialOffers = driver.findElement(ReceiveSpecialOffers_Locator);
				ReceiveSpecialOffers.click();
				scn.log("Receive special offers from our partners! :> " + rows.get(8).toString());
				continue;
			}

			if (i == 9) {
				WebElement FirstNameAddres = driver.findElement(FirstNameAddres_Locator);
				FirstNameAddres.sendKeys(rows.get(9).toString());
				scn.log("First name (YOUR ADDRESS)  :> " + rows.get(9).toString());
				continue;
			}

			if (i == 10) {
				WebElement LastNameAddress_ = driver.findElement(LastNameAddress_Locator);
				LastNameAddress_.sendKeys(rows.get(10).toString());
				scn.log("Last name (YOUR ADDRESS)  :> " + rows.get(10).toString());
				continue;
			}

			if (i == 11) {
				WebElement Company = driver.findElement(Company_Locator);
				Company.sendKeys(rows.get(11).toString());
				scn.log("Company (YOUR ADDRESS)  :> " + rows.get(11).toString());
				continue;
			}

			if (i == 12) {
				WebElement Address = driver.findElement(Address_Locator);
				Address.sendKeys(rows.get(12).toString());
				scn.log("Address (YOUR ADDRESS)  :> " + rows.get(12).toString());
				continue;
			}

			if (i == 13) {
				WebElement City = driver.findElement(City_Locator);
				City.sendKeys(rows.get(13).toString());
				scn.log("City (YOUR ADDRESS)  :> " + rows.get(13).toString());
				continue;
			}

			if (i == 14) {
				selectState(rows.get(14).toString());
				continue;
			}

			if (i == 15) {
				WebElement ZipCode = driver.findElement(ZipCode_Locator);
				ZipCode.sendKeys(rows.get(15).toString());
				scn.log("Zip/Postal Code (YOUR ADDRESS)  :> " + rows.get(15).toString());
				continue;
			}

			if (i == 16) {
				WebElement Country = driver.findElement(Country_Locator);
				Country.sendKeys(rows.get(16).toString());
				scn.log("Country (YOUR ADDRESS)  :> " + rows.get(16).toString());
				continue;
			}

			if (i == 17) {
				WebElement AdditionalInformation = driver.findElement(AdditionalInformation_Locator);
				AdditionalInformation.sendKeys(rows.get(17).toString());
				scn.log("Additional information (YOUR ADDRESS)  :> " + rows.get(17).toString());
				continue;
			}

			if (i == 18) {
				WebElement HomePhone = driver.findElement(HomePhone_Locator);
				HomePhone.sendKeys(rows.get(18).toString());
				scn.log("Home phone (YOUR ADDRESS)  :> " + rows.get(18).toString());
				continue;
			}

			if (i == 19) {
				WebElement MobilePhone = driver.findElement(MobilePhone_Locator);
				MobilePhone.sendKeys(rows.get(19).toString());
				scn.log("Mobile phone (YOUR ADDRESS)  :> " + rows.get(19).toString());
				continue;
			}

			if (i == 20) {
				WebElement AssignAnAddressAlias = driver.findElement(AssignAnAddressAlias_Locator);
				AssignAnAddressAlias.sendKeys(rows.get(20).toString());
				scn.log("Assign an address alias for future reference. (YOUR ADDRESS)  :> " + rows.get(20).toString());
			}
		}

	}

	public void assertFormFill() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(MyAccount_Locator));
		String account = driver.findElement(MyAccount_Locator).getText();
		Assert.assertEquals("Account is not created.", MyAccount_Veriable, account);
		scn.log("Account is created and asserted successfully :> " + account);
	}

	public void clickRegisterButton() {
		WebElement RegisterButton = driver.findElement(RegisterButon_Locator);
		RegisterButton.click();
		scn.log("Click on Register Button.");
	}
}
