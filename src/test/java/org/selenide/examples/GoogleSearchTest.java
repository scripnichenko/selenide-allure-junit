package org.selenide.examples;

import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GoogleSearchTest {
  private static final Logger logPerformanceTests= LoggerFactory.getLogger("statistic");

   @Test
  public void userCanSearchAnyKeyword() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASkrypnychenko\\IdeaProjects\\DataStructureCourse\\chromedriver_win32\\chromedriver.exe");
      Configuration.browser = "chrome";
      open("http://google.com/");

    logPerformanceTests.info("My test message [{}] executed in [{}] ms; query count [{}] with args [{}]. Node name: [{}]", new Object[]{
            "my.first.test.message", "125.25", "10", "10,25,abd", "llc.ulllkk.com:8051"
    });

    $(By.name("q")).val("selenide").pressEnter();
    $$("#ires li.g").shouldHave(size(10));
    $("#ires li.g").shouldHave(text("selenide.org"));
  }
}
