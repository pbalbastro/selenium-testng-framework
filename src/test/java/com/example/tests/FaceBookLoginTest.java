package com.example.tests;

import com.example.factory.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.pages.FacebookLoginPage;

/**
 * The Class FaceBookLoginTest.
 *
 * @author Bharathish
 */
@Test(testName = "Facebook login test", description = "Facebook login test")
public class FaceBookLoginTest extends BaseTest {

	@Test
	public void facebookLoginTest() {
		driver.get("https://www.facebook.com/");
		FacebookLoginPage facebookLoginPage = PageFactory.newInstance(FacebookLoginPage.class);
		facebookLoginPage.enterEmail("abc").enterPassword("abc").clickSignIn();
		Assert.assertTrue(false, "Login failed : Test failed");
	}
}
