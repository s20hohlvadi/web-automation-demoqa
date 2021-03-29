package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/menu")
public class MenuPage extends WidgetsPage {
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By MENU_TITLE = text("Menu");
  public static By MAIN_ITEM_1 = css("#nav > li:nth-child(1) > a");
  public static By MAIN_ITEM_2 = css("#nav > li:nth-child(2) > a");
  public static By MAIN_ITEM_3 = css("#nav > li:nth-child(3) > a");
  // Might be necessary to use a xpath selector
  public static By SUB_SUB_LIST = css("#nav>li:nth-child(2)>ul>li:nth-child(3)>a");
  public static By SUB_SUB_ITEM_1 = xpath("//*[@id=\'nav\']/li[2]/ul/li[3]/ul/li[1]/a");
  public static By SUB_SUB_ITEM_2 = xpath("//*[@id=\'nav\']/li[2]/ul/li[3]/ul/li[2]/a");
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(MENU_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }
}
