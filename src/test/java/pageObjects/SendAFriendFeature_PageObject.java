package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.JavaScriptUtil;
import Utilities.MouseAction;
import Utilities.Utilities;
import io.cucumber.java.Scenario;
import locatorsAndVeriablies.Locators;

/**
 * There is a object repository for the operations offered by
 * 'SendAFriendFeature_PageObject' class. This class help to achieve
 * encapsulation.
 * 
 * @Company: VisionIT
 * @Date: 19-August-2021
 * @Description: Test com.automationPractice-BDD FW development
 * @author Pravinkumar D Kadam
 */
public class SendAFriendFeature_PageObject extends Locators {

	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;
	Utilities utilities;
	JavaScriptUtil javaScriptUtil;
	MouseAction mouseAction;


	/**
	 * It is parameterized constructor of SendAFriendFeature_PageObject class. It
	 * use to initialize all driver, Scenario, WebDriverWait, TestContext, etc.....
	 * 
	 * @param driver
	 * @param wait
	 * @param scn
	 * @author Pravinkumar D Kadam
	 */
	public SendAFriendFeature_PageObject(WebDriver driver, WebDriverWait wait, Scenario scn) {
		this.driver = driver;
		this.wait = wait;
		this.scn = scn;
		utilities = new Utilities(this.driver, this.wait, this.scn);
		javaScriptUtil = new JavaScriptUtil(this.driver);
		mouseAction = new MouseAction(driver, wait, scn);
	}

	/**
	 * This method Use Already Created User name And Password and click on signIn
	 * button.
	 * 
	 * @param username
	 * @param password
	 * @author Pravinkumar D Kadam
	 */
	public void UseAlreadyCreatedUsernameAndPassword(String username, String password) {
		utilities.ClickElement(SignButton_Locator);
		javaScriptUtil.scrollIntoView_ByLocator(Authentication_Locator);

		utilities.enterText(username, EmailBoxForSignIn_Locator);
		scn.log("Enter mail id ::> " + username);

		utilities.enterText(password, PasswordBoxForSignIn_Locator);
		scn.log("Enter password ::> " + password);

		utilities.ClickElement(SignInButton_Locator);
		scn.log("click on SignIn Button.");
		try {
			String text = driver.findElement(Failed_Notification_Locator).getText();
			scn.log("There is 1 error in Login ::> " + text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Method select T-Shirts option from Product category.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void select_category_t_shirts() {
		utilities.ClickElement(Selet_t_shirts_Locator);
		scn.log("select T-shirts option.");
	}

	/**
	 * Method Move the courser on product and select More option. click on more
	 * option.
	 * 
	 * @author Pravinkumar D Kadam
	 */
	public void T_shirts_More_option() {
		javaScriptUtil.scrollIntoView_ByLocator(productImage_Locator);
		mouseAction.moveToelement(productPrice_Locator);
		utilities.ClickElement(ProductMoreOption_Locator);
		scn.log("select More option.");
	}

	/**
	 * Method Click on Send To Friend Link. a@author Pravinkumar D Kadam
	 *@author Pravinkumar D Kadam
	 */
	public void ClickSendToFriendLink() {
		utilities.ClickElement(SendToFriend_Locator);
	}

	/**
	 * Method fill Friend Name and mail ID.
	 * click on send button.
	 * @param FriendName
	 * @param FriendMailID
	 * @author Pravinkumar D Kadam
	 */
	public void Fill_details_click_Send_button(String FriendName, String FriendMailID) {
		utilities.enterText(FriendName, FriendNameBox_Locator);
		scn.log("enter Friend Name ::> " + FriendName);

		utilities.enterText(FriendMailID, FriendMailBox_Locator);
		scn.log("enter Friend Mail ID ::> " + FriendMailID);

		utilities.ClickElement(SendButton_Locator);
		scn.log("Click on Send button.");
	}

	/**
	 * Method help to validate send Option.
	 * @author Pravinkumar D Kadam
	 */
	public void validatesendOption() {
		WebElement text = driver.findElement(SendMassage_Locator);
		javaScriptUtil.drawBorder(text);
		scn.log(text.getText());
	}

}
