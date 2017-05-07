package org.selenide.examples;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchTest {
  @Test
  public void userCanSearchAnyKeyword() {
    System.setProperty("webdriver.chrome.driver", "D:\\MyProjects\\chromedriver_win32\\chromedriver.exe");
      Configuration.browser = "chrome";
      open("http://google.com/");
    $(By.name("q")).val("selenide").pressEnter();
    $$("#ires li.g").shouldHave(size(10));
    $("#ires li.g").shouldHave(text("selenide.org"));
  }
}
