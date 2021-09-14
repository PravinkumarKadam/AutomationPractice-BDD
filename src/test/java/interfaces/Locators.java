package interfaces;

import org.openqa.selenium.By;

public interface Locators {

	// #################### AllProductPriceAndTotal_PageObject ###############\\

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
	final By ReceiveSpecialOffers_Locator = By.xpath("//label[text()='Receive special offers from our partners!']");
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
			.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='T-shirts']");
	final By Failed_Notification_Locator = By.xpath("//div[@class='alert alert-danger']//li");
	final By ProductMoreOption_Locator = By.xpath("//div[@class='button-container']/a/span[text()='More']");
	final By productPrice_Locator = By.xpath("//div[@class='right-block']");
	final By productImage_Locator = By.xpath("//a[@class='product_img_link']/img");
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

	// #################### ChangeImageColor_PageObject ####################\\

	final By Tshirts_Locator = By
			.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[text()='T-shirts']");
	final By productColorBlue_Locator = By.xpath("//ul[@class='color_to_pick_list clearfix']/li/a[@id='color_2']");
	final By ColorChangeProduct_Locator = By.xpath("//img[@id='bigpic']");

	// #################### ValidateFacebookHandle_PageObject ####################\\
	final By FacebookHandle_Locator = By.xpath("//li[@class='facebook']");
	final By ValidateFacebookHandle_Locator = By.xpath("//div[@class='tr9rh885']//span[text()='Selenium Framework']");

	// #################### ValidateTwitterHandle_PageObject ####################\\
	final By TwitterHandle_Locator = By.xpath("//li[@class='twitter']");
	final By ValidateTwitterHandle_Locator = By
			.xpath("//div[@class='css-1dbjc4n r-1wbh5a2 r-dnmrzs r-1ny4l3l']//span[text()='Selenium Framework']");

	// #################### ValidateYoutubeHandle_PageObject ####################\\
	final By YoutubeHandle_Locator = By.xpath("//li[@class='youtube']");
	final By ValidateYoutubeHandle_Locator = By
			.xpath("//div[@id='channel-header-container']//yt-formatted-string[text()='Selenium Framework']");

	// #################### NewsletterSubscription_PageObject ####################\\

	final By newsletterSubscriptionBox_Locator = By.xpath("//input[@id='newsletter-input']");
	final By submitNewsletter_Locator = By.xpath("//button[@name='submitNewsletter']");
	final By ValidateSuccessfulEmailSubscription_Locator = By.xpath("//p[@class='alert alert-success']");

	// #################### ValidateCartValueUpdating_PageObject  ##################\\

	final By ProductsShortSleeve_t_shirts_Locator = By
			.xpath("//ul[@id='homefeatured']//h5/a[@title='Faded Short Sleeve T-shirts']");
	final By productBlouse_Locator = By.xpath("//ul[@id='homefeatured']//h5/a[@title='Blouse']");
	final By productPrintedChiffonDress_Locator = By
			.xpath("//ul[@id='homefeatured']//h5/a[@title='Printed Chiffon Dress']");
	final By product_AddToCart_Blouse_Locator = By.xpath(
			"//ul[@id='homefeatured']//a[@title='Blouse']//parent::h5[@itemprop='name']//@Following-sibling::div[@class='button-container']//span[text()='Add to cart']");
	final By product_AddToCart_ShortSleeve_T_Shirts_Locator = By.xpath(
			"//ul[@id='homefeatured']//a[@title='Faded Short Sleeve T-shirts']//parent::h5[@itemprop='name']//@Following-sibling::div[@class='button-container']//span[text()='Add to cart']");
	final By product_AddToCart_PrintedChiffonDress_Locator = By.xpath(
			"//ul[@id='homefeatured']//a[@title='Printed Chiffon Dress']//parent::h5[@itemprop='name']//@Following-sibling::div[@class='button-container']//span[text()='Add to cart']");
	final By continueShoppingButton_Locator = By.xpath("//span[@title='Continue shopping']/span");
	final By cartShowingProductCount_Locator = By.xpath("//span[@class='ajax_cart_quantity unvisible']");
	final By cartProduct_PrizeList_Locator = By.xpath("//div[@class='cart-info']//span[@class='price']");
	final By cartProduct_NameList_Locator = By.xpath("//a[@class='cart_block_product_name']");
	final By cartProductCancel_ShortSleeve_t_shirtsProduct_Locator = By
			.xpath("//a[@title='Faded Shor...']//parent::dt//span[@class='remove_link']");
	final By productPrize_ShortSleeve_t_shirtsProduct_Locator = By.xpath(
			"//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line hovered']//div[@class='left-block']//div[@class='content_price']");
	final By productPrize_BlouseProduct_Locator = By.xpath(
			"//ul[@id='homefeatured']/li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-mobile-line hovered']//div[@class='left-block']//div[@class='content_price']/span");
	final By productPrize__PrintedChiffonDressProduct_Locator = By.xpath(
			"//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-line first-item-of-tablet-line first-item-of-mobile-line last-mobile-line hovered']//div[@class='left-block']//div[@class='content_price']/span[@itemprop='price']");
	final By cartProductPrize_GrandTotal_Locator = By
			.xpath("//span[@class='price cart_block_total ajax_block_cart_total']");

}
