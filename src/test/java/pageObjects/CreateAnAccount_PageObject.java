package pageObjects;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.JavaScriptUtil;
import Utilities.Utilities;
import Utilities.WebDriverUtilities;
import io.cucumber.java.Scenario;

/**
 * There is a object repository for the operations offered by
 * 'CreateAnAccount_PageObject' class. This class help to achieve encapsulation.
 * 
 * @Author: Pravinkumar D Kadam
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 */
public class CreateAnAccount_PageObject {

	public WebDriver driver;
	public WebDriverWait wait;
	public Scenario scn;
	WebDriverUtilities webDriverUtilities;
	JavaScriptUtil javaScriptUtil;
	Utilities utilities;

	// #YOUR PERSONAL INFORMATION
	private final By SelectGender_Mr_Locator = By.xpath("//div[@id='uniform-id_gender1']");
	private final By FirstName_Locator = By.xpath("//input[@id='customer_firstname']");
	private final By LastName_Locator = By.xpath("//input[@id='customer_lastname']");
	private final By Password_Locator = By.xpath("//input[@id='passwd']");
	// # Date of Birth
	private final By Day_Locator = By.xpath("//select[@id='days']");////////
	private final By Month_Locator = By.xpath("//select[@id='months']");//////
	private final By Year_Locator = By.xpath("//select[@id='years']");///////
	private final By SignUpForUurNewsletter_Locator = By.xpath("//label[text()='Sign up for our newsletter!']");
	private final By ReceiveSpecialOffers_Locator = By
			.xpath("//label[text()='Receive special offers from our partners!']");
	// #YOUR ADDRESS
	private final By FirstNameAddres_Locator = By.xpath("//input[@id='firstname']");
	private final By LastNameAddress_Locator = By.xpath("//input[@id='lastname']");
	private final By Company_Locator = By.xpath("//input[@id='company']");
	private final By Address_Locator = By.xpath("//input[@id='address1']");
	private final By City_Locator = By.xpath("//input[@id='city']");
	private final By State_Locator = By.xpath("//select[@id='id_state']");////
	private final By ZipCode_Locator = By.xpath("//input[@id='postcode']");
	private final By Country_Locator = By.xpath("//select[@id='id_country']");///
	private final By AdditionalInformation_Locator = By.xpath("//textarea[@id='other']");
	private final By HomePhone_Locator = By.xpath("//input[@id='phone']");
	private final By MobilePhone_Locator = By.xpath("//input[@id='phone_mobile']");
	private final By AssignAnAddressAlias_Locator = By.xpath("//input[@id='alias']");
	private final By MyAccount_Locator = By.xpath("//h1[text()='My account']");
	private final By RegisterButon_Locator = By.xpath("//button[@id='submitAccount']");

	// variables
	private final String MyAccount_Variable = "MY ACCOUNT";

	/**
	 * This is parameterized constructor of class Use to initialize all
	 * WebDriver/Scenario/WebDriverWait/etc
	 *
	 * @param driver
	 * @param wait
	 * @param scn
	 * @author Pravinkumar D Kadam
	 */
	public CreateAnAccount_PageObject(WebDriver driver, WebDriverWait wait, Scenario scn) {
		this.driver = driver;
		this.scn = scn;
		this.wait = wait;
		utilities = new Utilities(this.driver, this.wait, this.scn);
		webDriverUtilities = new WebDriverUtilities(this.driver, this.scn);
		javaScriptUtil = new JavaScriptUtil(this.driver);
	}

	/**
	 * This method use to select Month from DropDown option
	 * 
	 * @param day
	 * @author PravinKumar D Kadam
	 */
	public void selectDay(String day) {
		webDriverUtilities.selectValueFromDropdwon(day, Day_Locator);
	}

	/**
	 * This method use to select Month from DropDown option
	 * 
	 * @param Month
	 * @author PravinKumar D Kadam
	 */
	public void selectMonth(String Month) {
		webDriverUtilities.selectValueFromDropdwon(Month, Month_Locator);
	}

	/**
	 * This method use to select Year from DropDown option
	 * 
	 * @param year
	 * @author PravinKumar D Kadam
	 */
	public void selectYear(String year) {
		webDriverUtilities.selectValueFromDropdwon(year, Year_Locator);
	}

	/**
	 * This method use to select State from DropDown option
	 * 
	 * @param State
	 * @author PravinKumar D Kadam
	 */
	public void selectState(String State) {
		webDriverUtilities.selectValueFromDropdwon(State, State_Locator);
	}

	/**
	 * This method use to select Country from DropDown option
	 * 
	 * @param Country
	 * @author PravinKumar D Kadam
	 */
	public void selectCountry(String Country) {
		webDriverUtilities.selectValueFromDropdwon(Country, Country_Locator);
	}

	/**
	 * This method use to select Gender option.
	 * 
	 * @author PravinKumar D Kadam
	 */
	public void selectGender() {
		utilities.ClickElement(SelectGender_Mr_Locator);
		scn.log("Selected Gender is :> " + "Mr.");
	}

	/**
	 * This method fill all the information from Data Table.
	 * 
	 * @param table
	 * @author PravinKumar D Kadam
	 */
	public void enterValidData(io.cucumber.datatable.DataTable table) {
		List<String> rows = table.column(1);

		for (int i = 0; i < rows.size(); i++) {

			if (i == 1) {
				utilities.enterText(rows.get(1).toString(),FirstName_Locator);
				scn.log("First name :> " + rows.get(1).toString());
				continue;
			}

			if (i == 2) {
				utilities.enterText(rows.get(2).toString(),LastName_Locator);
				scn.log("Last name :> " + rows.get(2).toString());
				continue;
			}

			if (i == 3) {
				utilities.enterText(rows.get(3).toString(),Password_Locator);
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
				utilities.ClickElement(SignUpForUurNewsletter_Locator);
				scn.log("Sign up for our newsletter! :> " + rows.get(7).toString());
				continue;
			}

			if (i == 8) {
				utilities.ClickElement(ReceiveSpecialOffers_Locator);
				scn.log("Receive special offers from our partners! :> " + rows.get(8).toString());
				continue;
			}

			if (i == 9) {
				utilities.enterText(rows.get(9).toString(),FirstNameAddres_Locator);
				scn.log("First name (YOUR ADDRESS)  :> " + rows.get(9).toString());
				continue;
			}

			if (i == 10) {
				utilities.enterText(rows.get(10).toString(),LastNameAddress_Locator);
				scn.log("Last name (YOUR ADDRESS)  :> " + rows.get(10).toString());
				continue;
			}

			if (i == 11) {
				utilities.enterText(rows.get(11).toString(),Company_Locator);
				scn.log("Company (YOUR ADDRESS)  :> " + rows.get(11).toString());
				continue;
			}

			if (i == 12) {
				utilities.enterText(rows.get(12).toString(),Address_Locator);
				scn.log("Address (YOUR ADDRESS)  :> " + rows.get(12).toString());
				continue;
			}

			if (i == 13) {
				utilities.enterText(rows.get(13).toString(),City_Locator);
				scn.log("City (YOUR ADDRESS)  :> " + rows.get(13).toString());
				continue;
			}

			if (i == 14) {
				selectState(rows.get(14).toString());
				continue;
			}

			if (i == 15) {
				utilities.enterText(rows.get(15).toString(),ZipCode_Locator);
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
				utilities.enterText(rows.get(17).toString(),AdditionalInformation_Locator);
				scn.log("Additional information (YOUR ADDRESS)  :> " + rows.get(17).toString());
				continue;
			}

			if (i == 18) {
				utilities.enterText(rows.get(18).toString(),HomePhone_Locator);
				scn.log("Home phone (YOUR ADDRESS)  :> " + rows.get(18).toString());
				continue;
			}

			if (i == 19) {
				utilities.enterText(rows.get(19).toString(), MobilePhone_Locator);
				scn.log("Mobile phone (YOUR ADDRESS)  :> " + rows.get(19).toString());
				continue;
			}

			if (i == 20) {
				utilities.enterText(rows.get(20).toString(),AssignAnAddressAlias_Locator);
				scn.log("Assign an address alias for future reference. (YOUR ADDRESS)  :> " + rows.get(20).toString());
			}
		}

	}

	/**
	 * This Method use to verify Account is created or not.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void assertFormFill() {
		utilities.waitForElementClickable(MyAccount_Locator);
		String account = driver.findElement(MyAccount_Locator).getText();
		Assert.assertEquals("Account is not created.", MyAccount_Variable, account);
		scn.log("Account is created and asserted successfully :> " + account);
	}

	/**
	 * This method use to click register Button on Create an Account page.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void clickRegisterButton() {
		javaScriptUtil.scrollIntoView_ByLocator(HomePhone_Locator);
		utilities.ClickElement(RegisterButon_Locator);
		scn.log("Click on Register Button.");
	}
}
