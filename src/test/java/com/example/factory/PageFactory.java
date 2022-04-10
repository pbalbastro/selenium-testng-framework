package com.example.factory;

import java.lang.reflect.InvocationTargetException;

import com.example.context.WebDriverContext;
import org.openqa.selenium.WebDriver;

import com.example.pages.BasePage;

/**
 * A factory for creating Pageinstances objects.
 */
public class PageFactory {

	/**
	 * Gets the single instance of PageinstancesFactory.
	 *
	 * @param <T> the generic type
	 * @param type the type
	 * @return single instance of PageinstancesFactory
	 */
	public static <T extends BasePage> T newInstance(Class<T> type) {
		try {
			return type.getConstructor(WebDriver.class).newInstance(WebDriverContext.getDriver());
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			return null;
		}
	}
}
