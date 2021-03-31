package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/links")
public class LinksPage extends ElementsPage {
    //Home work page
    // Locators ----------------------------------------------------------------------------------------------------------
    public static By LINKS_TITLE = text("Links");
    public static By HOME_TITLE = css("#app > div > div > div.home-banner > a > img");
    public static By CREATED_LINK = id("created");
    public static By NO_CONTENT_LINK = id("no-content");
    public static By MOVED_LINK = id("moved");
    public static By BAD_REQUEST_LINK = id("bad-request");
    public static By UNAUTHORIZED_LINK = id("unauthorized");
    public static By FORBIDDEN_LINK = id("forbidden");
    public static By NOT_FOUND_LINK = id("invalid-url");
    public static By HOME_LINK = id("simpleLink");
    public static By DYNAMIC_HOME_LINK = id("dynamicLink");
    public static By RESPONSE = css("p[id='linkResponse']");
    // Public methods ----------------------------------------------------------------------------------------------------
    public void waitForPageToLoad() {
        getElement(LINKS_TITLE).waitUntilPresent();
        logWeAreOnPage();
    }
    public void waitForHomePageToLoad() {
        getElement(HOME_TITLE).waitUntilPresent();
        logWeAreOnPage();
    }
}