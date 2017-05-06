package org.selenide.examples;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchTest {
  @Test
  public void userCanSearchAnyKeyword() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\2.53.1");
    open("http://google.com/en");
    $(By.name("q")).val("selenide").pressEnter();
    $$("#ires li.g").shouldHave(size(10));
    $("#ires li.g").shouldHave(text("selenide.org"));
  }
}
