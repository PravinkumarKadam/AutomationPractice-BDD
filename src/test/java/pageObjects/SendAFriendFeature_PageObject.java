package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.JavaScriptUtil;
import Utilities.MouseAction;
import Utilities.Utilities;
import io.cucumber.java.Scenario;

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
public class SendAFriendFeature_PageObject {

	Scenario scn;
	WebDriver driver;
	WebDriverWait wait;
	Utilities utilities;
	JavaScriptUtil javaScriptUtil;
	MouseAction mouseAction;

	private final By SignButton_Locator = By.xpath("//a[@class='login']");
	private final By EmailBoxForSignIn_Locator = By.xpath("//input[@id='email']");
	private final By PasswordBoxForSignIn_Locator = By.xpath("//input[@id='passwd']");
	private final By SignInButton_Locator = By.xpath("//button[@id='SubmitLogin']");
	private final By Selet_t_shirts_Locator = By
			.xpath("//ul[@class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li/a[text()='T-shirts']");
	private final By Failed_Notification_Locator = By.xpath("//div[@class='alert alert-danger']//li");
	private final By ProductMoreOption_Locator = By.xpath("//div[@class='button-container']/a/span[text()='More']");
	private final By productPrice_Locator = By.xpath("//div[@class=\"right-block\"]");
	private final By productImage_Locator = By.xpath("//a[@class=\"product_img_link\"]/img");
	private final By SendToFriend_Locator = By.xpath("//a[@id='send_friend_button']");
	private final By FriendNameBox_Locator = By.xpath("//input[@id='friend_name']");
	private final By FriendMailBox_Locator = By.xpath("//input[@id='friend_email']");
	private final By SendMassage_Locator = By.xpath("//div[@class='fancybox-inner']/p");
	private final By Authentication_Locator = By.xpath("//h1[text()='Authentication']");
	private final By SendButton_Locator = By.xpath("//button[@id='sendEmail']");

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
