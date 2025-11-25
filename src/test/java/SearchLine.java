import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;

public class SearchLine {

    public SearchLine(SelenideElement element) {
        this.element = element;
    }

    SelenideElement element;

    public SearchLine click() {
        element.shouldBe(visible);
        element.click();
        return this;
    }
}
