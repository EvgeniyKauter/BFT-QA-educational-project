import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SearchPage {

    SelenideElement inputWord = $(By.name("text"));
    private final SearchLine searchLine = new SearchLine($(By.name("text")));

    @Step("Вводим поисковое слово")
    public SearchPage setInputWord(String text) {
        searchLine.click();
        inputWord.setValue(text);
        return this;
    }

    @Step ("Нажать Поиск")
    public SearchPage pressEnter() {
        inputWord.pressEnter();
        return this;
    }

    @Step ("Открыть страницу")
    public SearchPage openPage (String url) {
        open(url);
        return this;
    }

    @Step ("Проверить видимость")
    public SearchPage toBeVisible(SelenideElement element) {
        element.shouldBe(visible);
        return this;
    }

    @Step ("Явное ожидание 3 сек")
    public SearchPage wait(int mls) {
        sleep(mls);
        return this;
    }
}
