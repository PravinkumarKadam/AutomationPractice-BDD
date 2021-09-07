package interfaces;

import org.openqa.selenium.By;

public interface Locators {
	
	// #################### AllProductPriceAndTotal_PageObject ####################\\

    final By Dresses_locator = By.xpath("//div[@id='block_top_menu']/ul/li/a[text()='Dresses']");
    final By priceOfProduct_locator = By.xpath("//div[@class='right-block']//span[@itemprop='price']");
    final By ProductView_Locator = By.xpath("//a[@class='product_img_link']");

	
	// #################### CreateAnAccount_PageObject ####################\\

	// #YOUR PERSONAL INFORMATION
	final By SelectGender_Mr_Locator = By.xpath("//div[@id='uniform-id_gender1']");
	final By FirstName_Locator = By.xpath("//input[@id='customer_firstname']");
	final By LastName_Locator = By.xpath("//input[@id='customer_lastname']");
	final By Password_Locator = By.xpath("//input[@id='passwd']");
	// # Date of Birth
	final By Day_Locator = By.xpath("//select[@id='days']");////////
	final By Month_Locator = By.xpath("//select[@id='months']");//////
	final By Year_Locator = By.xpath("//select[@id='years']");///////
	final By SignUpForUurNewsletter_Locator = By.xpath("//label[text()='Sign up for our newsletter!']");
	final By ReceiveSpecialOffers_Locator = By
			.xpath("//label[text()='Receive special offers from our partners!']");
	// #YOUR ADDRESS
	final By FirstNameAddres_Locator = By.xpath("//input[@id='firstname']");
	final By LastNameAddress_Locator = By.xpath("//input[@id='lastname']");
	final By Company_Locator = By.xpath("//input[@id='company']");
	final By Address_Locator = By.xpath("//input[@id='address1']");
	final By City_Locator = By.xpath("//input[@id='city']");
	final By State_Locator = By.xpath("//select[@id='id_state']");////
	final By ZipCode_Locator = By.xpath("//input[@id='postcode']");
	final By Country_Locator = By.xpath("//select[@id='id_country']");///
	final By AdditionalInformation_Locator = By.xpath("//textarea[@id='other']");
	final By HomePhone_Locator = By.xpath("//input[@id='phone']");
	final By MobilePhone_Locator = By.xpath("//input[@id='phone_mobile']");
	final By AssignAnAddressAlias_Locator = By.xpath("//input[@id='alias']");
	final By MyAccount_Locator = By.xpath("//h1[text()='My account']");
	final By RegisterButon_Locator = By.xpath("//button[@id='submitAccount']");

	
	// #################### LandingPage_PageObject ####################\\

	final By productCatageroyLocator = By.xpath("//div[@id='block_top_menu']/ul/li/a");
	final By logoImageLocator = By.xpath("//img[@class='logo img-responsive']");

	
	
	// #################### SendAFriendFeature_PageObject ####################\\

	final By EmailBoxForSignIn_Locator = By.xpath("//input[@id='email']");
	final By PasswordBoxForSignIn_Locator = By.xpath("//input[@id='passwd']");
	final By SignInButton_Locator = By.xpath("//button[@id='SubmitLogin']");
	final By Selet_t_shirts_Locator = By
			.xpath("//ul[@class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li/a[text()='T-shirts']");
	final By Failed_Notification_Locator = By.xpath("//div[@class='alert alert-danger']//li");
	final By ProductMoreOption_Locator = By.xpath("//div[@class='button-container']/a/span[text()='More']");
	final By productPrice_Locator = By.xpath("//div[@class=\"right-block\"]");
	final By productImage_Locator = By.xpath("//a[@class=\"product_img_link\"]/img");
	final By SendToFriend_Locator = By.xpath("//a[@id='send_friend_button']");
	final By FriendNameBox_Locator = By.xpath("//input[@id='friend_name']");
	final By FriendMailBox_Locator = By.xpath("//input[@id='friend_email']");
	final By SendMassage_Locator = By.xpath("//div[@class='fancybox-inner']/p");
	final By SendButton_Locator = By.xpath("//button[@id='sendEmail']");

	
	
	// #################### SignInPage_PageObjects ####################\\

	// Locator
	final By SignButton_Locator = By.xpath("//a[@class='login']");
	final By SignPageMailBox_Locator = By.xpath("//input[@id='email_create']");
	final By CreatAccountButton_Locator = By.xpath("//button[@id='SubmitCreate']/span");
	final By VerifycreateAccountTitle_Locator = By.xpath("//h1[contains(text(),'Create an account')]");
	final By Authentication_Locator = By.xpath("//h1[text()='Authentication']");
	
	
	// #################### ValidateSearchBox_PageObject ####################\\

	final By searchBox_Locator = By.xpath("//input[@id='search_query_top']");
	final By searchBoxSuggestion_Locator = By.xpath("//div[@class='ac_results']//li");


}
