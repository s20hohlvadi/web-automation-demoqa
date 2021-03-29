package com.testing.pageObjects.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.WebElementFacade;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/auto-complete")
public class AutoCompletePage extends WidgetsPage{
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By AUTO_COMPLETE_TITLE = text("Auto Complete");
  // Element to which you would send keystrokes
  public static By MULTIPLE_COLOR_FIELD = css("div[class=' css-2b097c-container']");
  // Element containing the information about actual values
  public static By MULTIPLE_COLOR_CONTAINER = text("div[class='css-1rhbuit-multiValue auto-complete__multi-value']");
  // Element to which you would send keystrokes
  public static By SINGLE_COLOR_FIELD = css("input[id='auto-complete__input']");
  // Element containing the information about actual values
  public static By SINGLE_COLOR_CONTAINER = css("div[id=autoCompleteMultipleContainer']");
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(AUTO_COMPLETE_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }

  public void setElementValueTo(String elementName, String value){
    switch(elementName){
      case "SINGLE_COLOR_FIELD":
      case "MULTIPLE_COLOR_FIELD":
        // Create a logic that would input the value into given fields, and press (or send) the enter key (Keys.ENTER)
        WebElementFacade e = getElement(elementName);
        
        break;
      default:
        super.setElementValueTo(elementName, value);
    }
  }
}
