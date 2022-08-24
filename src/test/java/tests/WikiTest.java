package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class WikiTest extends TestBase {
    @Test
    void wikiTest() {
        back();
        step("Search War page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();
            $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("War");
        });
        step("Open War page", () -> $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title"))
                .get(0).shouldHave(Condition.text("War")).click());
        step("Check War page", () -> {
            $(AppiumBy.className("android.widget.TextView"))
                    .shouldHave(Condition.text("War"));
        });
    }
}