package com.example.tests;

import com.example.factory.PageFactory;
import com.example.pages.GooglePage;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * The Class GoogleSearchTest.
 *
 * @author Bharathish
 */
@Test(testName = "Google search test", description = "Test description")
public class GoogleSearchTest extends BaseTest {

	/**
	 * Google search test.
	 */
	@Test
	public void googleSearchTest() {
		driver.get("https://www.google.co.in/");
		GooglePage googlePage = PageFactory.newInstance(GooglePage.class);
		googlePage.searchText("abc");
		Assert.assertTrue(driver.getTitle().contains("abc"), "Title doesn't contain abc : Test Failed");
	}
}
