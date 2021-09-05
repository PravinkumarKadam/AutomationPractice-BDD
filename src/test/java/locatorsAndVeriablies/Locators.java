package locatorsAndVeriablies;

import org.openqa.selenium.By;

/**
 * This class help to manage all locator of web application.
 * 
 * @author Praivnkumar D Kadam
 *
 */
public class Locators {

	// #################### AllProductPriceAndTotal_PageObject ####################\\

	protected final By Dresses_locator = By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='Dresses']");
	protected final By priceOfProduct_locator = By.xpath("//div[@class='right-block']//span[@itemprop='price']");
	protected final By ProductView_Locator = By.xpath("//a[@class=\"product_img_link\"]");

	
	
	// #################### CreateAnAccount_PageObject ####################\\

	// #YOUR PERSONAL INFORMATION
	protected final By SelectGender_Mr_Locator = By.xpath("//div[@id='uniform-id_gender1']");
	protected final By FirstName_Locator = By.xpath("//input[@id='customer_firstname']");
	protected final By LastName_Locator = By.xpath("//input[@id='customer_lastname']");
	protected final By Password_Locator = By.xpath("//input[@id='passwd']");
	// # Date of Birth
	protected final By Day_Locator = By.xpath("//select[@id='days']");////////
	protected final By Month_Locator = By.xpath("//select[@id='months']");//////
	protected final By Year_Locator = By.xpath("//select[@id='years']");///////
	protected final By SignUpForUurNewsletter_Locator = By.xpath("//label[text()='Sign up for our newsletter!']");
	protected final By ReceiveSpecialOffers_Locator = By
			.xpath("//label[text()='Receive special offers from our partners!']");
	// #YOUR ADDRESS
	protected final By FirstNameAddres_Locator = By.xpath("//input[@id='firstname']");
	protected final By LastNameAddress_Locator = By.xpath("//input[@id='lastname']");
	protected final By Company_Locator = By.xpath("//input[@id='company']");
	protected final By Address_Locator = By.xpath("//input[@id='address1']");
	protected final By City_Locator = By.xpath("//input[@id='city']");
	protected final By State_Locator = By.xpath("//select[@id='id_state']");////
	protected final By ZipCode_Locator = By.xpath("//input[@id='postcode']");
	protected final By Country_Locator = By.xpath("//select[@id='id_country']");///
	protected final By AdditionalInformation_Locator = By.xpath("//textarea[@id='other']");
	protected final By HomePhone_Locator = By.xpath("//input[@id='phone']");
	protected final By MobilePhone_Locator = By.xpath("//input[@id='phone_mobile']");
	protected final By AssignAnAddressAlias_Locator = By.xpath("//input[@id='alias']");
	protected final By MyAccount_Locator = By.xpath("//h1[text()='My account']");
	protected final By RegisterButon_Locator = By.xpath("//button[@id='submitAccount']");
	// variables
	protected final String MyAccount_Variable = "MY ACCOUNT";

	
	
	// #################### LandingPage_PageObject ####################\\

	protected final By productCatageroyLocator = By.xpath("//div[@id='block_top_menu']/ul/li/a");
	protected final By logoImageLocator = By.xpath("//img[@class='logo img-responsive']");

	
	
	// #################### SendAFriendFeature_PageObject ####################\\

	protected final By EmailBoxForSignIn_Locator = By.xpath("//input[@id='email']");
	protected final By PasswordBoxForSignIn_Locator = By.xpath("//input[@id='passwd']");
	protected final By SignInButton_Locator = By.xpath("//button[@id='SubmitLogin']");
	protected final By Selet_t_shirts_Locator = By
			.xpath("//ul[@class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li/a[text()='T-shirts']");
	protected final By Failed_Notification_Locator = By.xpath("//div[@class='alert alert-danger']//li");
	protected final By ProductMoreOption_Locator = By.xpath("//div[@class='button-container']/a/span[text()='More']");
	protected final By productPrice_Locator = By.xpath("//div[@class=\"right-block\"]");
	protected final By productImage_Locator = By.xpath("//a[@class=\"product_img_link\"]/img");
	protected final By SendToFriend_Locator = By.xpath("//a[@id='send_friend_button']");
	protected final By FriendNameBox_Locator = By.xpath("//input[@id='friend_name']");
	protected final By FriendMailBox_Locator = By.xpath("//input[@id='friend_email']");
	protected final By SendMassage_Locator = By.xpath("//div[@class='fancybox-inner']/p");
	protected final By SendButton_Locator = By.xpath("//button[@id='sendEmail']");

	
	
	// #################### SignInPage_PageObjects ####################\\

	// Locator
	protected final By SignButton_Locator = By.xpath("//a[@class='login']");
	protected final By SignPageMailBox_Locator = By.xpath("//input[@id='email_create']");
	protected final By CreatAccountButton_Locator = By.xpath("//button[@id='SubmitCreate']/span");
	protected final By VerifycreateAccountTitle_Locator = By.xpath("//h1[contains(text(),'Create an account')]");
	protected final By Authentication_Locator = By.xpath("//h1[text()='Authentication']");
	// Variable
	protected final String VerifycreateAccountTitle_variable = "CREATE AN ACCOUNT";

	
	
	// #################### ValidateSearchBox_PageObject ####################\\

	protected final By searchBox_Locator = By.xpath("//input[@id='search_query_top']");
	protected final By searchBoxSuggestion_Locator = By.xpath("//div[@class='ac_results']//li");

}
