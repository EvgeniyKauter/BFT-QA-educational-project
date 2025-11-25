import org.junit.jupiter.api.Test;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class UITest {

    SearchPage ribalkaSearch = new SearchPage();
    SearchPage searchRibalka = new SearchPage();
    @Test
    void test1() {

        ribalkaSearch.openPage("https://ya.ru/")
                .setInputWord("рыбалка")
                .pressEnter()
                .toBeVisible($(By.xpath("/html/body/div[1]/div[1]/header/form/div[1]/a/svg/path[1]")));

    }

    @Test
    void test2(){

        searchRibalka.openPage("https://ya.ru/")
                .wait(3000)
                .setInputWord("рыбалка");
    }
}
