package com.testing.pageObjects.pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/select-menu")
public class SelectMenuPage extends WidgetsPage{
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By SELECT_MENU_TITLE = text("Select Menu");
  public static By SELECT_VALUE = css("div[class=' css-1hwfws3']");
  public static By SELECT_ONE = css("div[id='selectOne']");
  public static By OLD_STYLE_SELECT_MENU = css("select[id='oldSelectMenu']");;
  public static By MULTISELECT_DROP_DOWN = css("input[id='react-select-4-input']");
  // Field containing selected values. Might need an xpath selector
  public static By MULTISELECT_DROP_DOWN_VALUES = css("div[class=row]>div>div[class$='container']");
  public static By VOLVO = css("select[id=cars]>option[value=volvo]");
  public static By SAAB = css("select[id=cars]>option[value=saab]");
  public static By OPEL = css("select[id=cars]>option[value=opel]");
  public static By AUDI = css("select[id=cars]>option[value=audi]");
  // Selector that would allow to get either of given four car brands.
  public static By CAR_MENU_OPTIONS;
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(SELECT_MENU_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }

  public void setElementValueTo(String elementName, String value){
    switch(elementName){
      case "SELECT_VALUE":
      case "OLD_STYLE_SELECT_MENU":
      case "SELECT_ONE":
        click(elementName);
        click(text(value));
        // Clicking title to loose focus
        getElement(SELECT_MENU_TITLE).click();
        break;
      case "MULTISELECT_DROP_DOWN":
        click(elementName);
        getElement(elementName).sendKeys(value);
        getElement(elementName).sendKeys(Keys.ENTER);
        // Clicking title to loose focus
        getElement(SELECT_MENU_TITLE).click();
        break;
      default:
        super.setElementValueTo(elementName, value);
    }
  }

  public Boolean validateStandardMultiSelect(DataTable data){
    for (Map<String, String> map : dataToMap(data)) {
      for (String key : map.keySet()) {
        String value = snakify(map.get(key));
        WebElementFacade e = getElement(snakify(value));
        info("Validating: " + value);
        if(e.getCssValue("background-color").contains("0, 0, 0, 0")) return false;
      }
    }
    return true;
  }
}
