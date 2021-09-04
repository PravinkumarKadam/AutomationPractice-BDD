package locatorsAndVeriablies;


import org.openqa.selenium.By;
/**
 * This class help to manage all locator of web application.
 * @author Praivnkumar D Kadam
 *
 */
public class Locators {

	//#################### AllProductPriceAndTotal_PageObject  ####################\\

	protected static final By Dresses_locator = By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='Dresses']");
	protected static final By priceOfProduct_locator = By.xpath("//div[@class='right-block']//span[@itemprop='price']");
	protected static final By ProductView_Locator = By.xpath("//a[@class=\"product_img_link\"]");

	//#################### CreateAnAccount_PageObject  ####################\\

	// #YOUR PERSONAL INFORMATION
	protected static final By SelectGender_Mr_Locator = By.xpath("//div[@id='uniform-id_gender1']");
	protected static final By FirstName_Locator = By.xpath("//input[@id='customer_firstname']");
	protected static final By LastName_Locator = By.xpath("//input[@id='customer_lastname']");
	protected static final By Password_Locator = By.xpath("//input[@id='passwd']");
	// # Date of Birth
	protected static final By Day_Locator = By.xpath("//select[@id='days']");////////
	protected static final By Month_Locator = By.xpath("//select[@id='months']");//////
	protected static final By Year_Locator = By.xpath("//select[@id='years']");///////
	protected static final By SignUpForUurNewsletter_Locator = By.xpath("//label[text()='Sign up for our newsletter!']");
	protected static final By ReceiveSpecialOffers_Locator = By
			.xpath("//label[text()='Receive special offers from our partners!']");
	// #YOUR ADDRESS
	protected static final By FirstNameAddres_Locator = By.xpath("//input[@id='firstname']");
	protected static final By LastNameAddress_Locator = By.xpath("//input[@id='lastname']");
	protected static final By Company_Locator = By.xpath("//input[@id='company']");
	protected static final By Address_Locator = By.xpath("//input[@id='address1']");
	protected static final By City_Locator = By.xpath("//input[@id='city']");
	protected static final By State_Locator = By.xpath("//select[@id='id_state']");////
	protected static final By ZipCode_Locator = By.xpath("//input[@id='postcode']");
	protected static final By Country_Locator = By.xpath("//select[@id='id_country']");///
	protected static final By AdditionalInformation_Locator = By.xpath("//textarea[@id='other']");
	protected static final By HomePhone_Locator = By.xpath("//input[@id='phone']");
	protected static final By MobilePhone_Locator = By.xpath("//input[@id='phone_mobile']");
	protected static final By AssignAnAddressAlias_Locator = By.xpath("//input[@id='alias']");
	protected static final By MyAccount_Locator = By.xpath("//h1[text()='My account']");
	protected static final By RegisterButon_Locator = By.xpath("//button[@id='submitAccount']");

	// variables
	protected static final String MyAccount_Variable = "MY ACCOUNT";



	//#################### LandingPage_PageObject  ####################\\

	protected static final By productCatageroyLocator = By.xpath("//div[@id='block_top_menu']/ul/li/a");
	protected static final By logoImageLocator = By.xpath("//img[@class='logo img-responsive']");


	//#################### SendAFriendFeature_PageObject  ####################\\

	protected static final By EmailBoxForSignIn_Locator = By.xpath("//input[@id='email']");
	protected static final By PasswordBoxForSignIn_Locator = By.xpath("//input[@id='passwd']");
	protected static final By SignInButton_Locator = By.xpath("//button[@id='SubmitLogin']");
	protected static final By Selet_t_shirts_Locator = By
			.xpath("//ul[@class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li/a[text()='T-shirts']");
	protected static final By Failed_Notification_Locator = By.xpath("//div[@class='alert alert-danger']//li");
	protected static final By ProductMoreOption_Locator = By.xpath("//div[@class='button-container']/a/span[text()='More']");
	protected static final By productPrice_Locator = By.xpath("//div[@class=\"right-block\"]");
	protected static final By productImage_Locator = By.xpath("//a[@class=\"product_img_link\"]/img");
	protected static final By SendToFriend_Locator = By.xpath("//a[@id='send_friend_button']");
	protected static final By FriendNameBox_Locator = By.xpath("//input[@id='friend_name']");
	protected static final By FriendMailBox_Locator = By.xpath("//input[@id='friend_email']");
	protected static final By SendMassage_Locator = By.xpath("//div[@class='fancybox-inner']/p");
	protected static final By SendButton_Locator = By.xpath("//button[@id='sendEmail']");


	//#################### SignInPage_PageObjects  ####################\\

	// Locator	
	protected static final By SignButton_Locator = By.xpath("//a[@class='login']");
	protected static final By SignPageMailBox_Locator = By.xpath("//input[@id='email_create']");
	protected static final By CreatAccountButton_Locator = By.xpath("//button[@id='SubmitCreate']/span");
	protected static final By VerifycreateAccountTitle_Locator = By.xpath("//h1[contains(text(),'Create an account')]");
	protected static final By Authentication_Locator = By.xpath("//h1[text()='Authentication']");

	// Variable
	protected static final String VerifycreateAccountTitle_variable = "CREATE AN ACCOUNT";



	//#################### ValidateSearchBox_PageObject  ####################\\

	protected static final By searchBox_Locator = By.xpath("//input[@id='search_query_top']");
	protected static final By searchBoxSuggestion_Locator = By.xpath("//div[@class='ac_results']//li");


}
